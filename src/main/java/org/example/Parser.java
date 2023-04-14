package org.example;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.example.model.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Parser {


    static List<String> list = new ArrayList<>();
    static List<List<String>> listList = new ArrayList<>();
    static Set<String> allNamePc = new HashSet<>();

    public static String parse(String name) {

        String result = "";
        String res = "";
        InputStream in = null;
        XSSFWorkbook wb = null;

        try {
            in = new FileInputStream(name);
            wb = new XSSFWorkbook(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert wb != null;
        Sheet sheet = wb.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        while (it.hasNext()) {
            Row row = it.next();
            Iterator<Cell> cells = row.iterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
                CellType cellType = cell.getCellType();
                switch (cellType) {
                    case STRING:
                        if (cell.getStringCellValue().equals("Параметр")) {
                            break;
                        }
                        if (cell.getStringCellValue().equals("Значение")) {
                            break;
                        }
                        if (cell.getStringCellValue().equals("IP")) {
                            break;
                        }
                        if (cell.getStringCellValue().equals("Компьютер")) {
                            break;
                        }
                        if (cell.getStringCellValue().equals("Пользователь")) {
                            break;
                        }
                        list.add(cell.getStringCellValue());
                        break;
                    case NUMERIC:
//                        addOption(cell.getStringCellValue(), list);
                        break;
                    default:
                        break;
                }
            }

            //Add newList with rows to Listlist
            listList.add(makeNewListAndClearList(list));

        }
        listList.remove(0);
        allNamePc = getListNamePc(listList);


//        sortOption(listList);
        return result;
    }

    public static Map<String, PC> getMapWithKey(Set<String> allNamePc, Map<String, PC> PcMap) {
        for (String key : allNamePc) {
            PcMap.put(key, new PC(key));
        }
        return PcMap;
    }


    public static Set<String> getListNamePc(List<List<String>> listList) {
        Set<String> setNamePc = new HashSet<>();
//        for (List<String> list : listList) {
//            setNamePc.add(list.get(3));
//        }
        setNamePc.add("KUNGUR93");
        setNamePc.add("ONGM53");

        return setNamePc;
    }

    public static List<String> makeNewListAndClearList(List<String> list) {
        List<String> newList = new ArrayList<>();

        //Copy list with rows to newList
        newList.addAll(0, list);

        //Clear old list
        list.clear();

        return newList;
    }

    public static Map<String, PC> sortOption(List<List<String>> listList, Set<String> allNamePc) {
        Map<String, PC> PcMap = new HashMap<>();
        PC pc = new PC();

        getMapWithKey(allNamePc, PcMap);

        String strNamePc = null;
        String strIp = null;
        String strUser = null;
        for (List<String> listRows : listList) {

            strNamePc = listRows.get(3);
            strIp = listRows.get(2);
            strUser = listRows.get(4);

//            if (!strNamePc.equals(pc.getNamePc())) {
//                for (String namePc : allNamePc) {
//                    if (strNamePc.equals(String.valueOf(namePc))) {
//                        if (PcMap.containsKey(namePc)) {
//                            pc = getFilledPc(strNamePc, strIp, strUser);
//                            PcMap.put(strNamePc, pc);
//                        } else {
//                            System.out.println("ПК не найден в списке");
//                        }
//                    }
//                }
//            }
        }
        PcMap.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
        return PcMap;
    }

//    public static boolean checkPC(PC pc) {
//        return pc.getNamePcDomain() == null && pc.getIp() == null;
//    }

    public static List<PC> createListPC(List<List<String>> listList) {
        List<PC> listPC = new ArrayList<>();
        PC pc = null;
        for (List<String> listRows : listList) {

            String strNamePc = listRows.get(3);
            String strIp = listRows.get(2);
            String strUser = listRows.get(4);

            for (String namePc : allNamePc) {
                if (strNamePc.equals(String.valueOf(namePc))) {
                    pc = getFilledPc(strNamePc, strIp, strUser);
                    listPC.add(pc);
                }

            }

        }
        return listPC;
    }

    public static PC getFilledPc(String strNamePc, String strIp, String strUser) {
        PC pc = new PC(strNamePc, strIp, strUser);
        for (List<String> listRows : listList) {
            if (strNamePc.equals(listRows.get(3))) {
                checkOption(listRows.get(0), listRows.get(1), pc);
            } else {
                break;
            }
        }
        return pc;
    }

    public static List<String> getListMarkersForOptions(List<String> ListMarkersForOptions) {
        Collections.addAll(ListMarkersForOptions,
                "Домен",
                "Домен Имя пользователя",
                "Домен Адрес",
                "Домен Организация",
                "Домен Подразделение",
                "Домен Комната",
                "Домен Тел",
                "Домен ФИО",
                "Домен Должность",
                "ЦПУ Процессор",
                "ЦПУ Частота",
                "ЦПУ Разрядность",
                "ЦПУ Ядер",
                "ЦПУ Потоков",
                "ОС",
                "ОС Сервисный пакет",
                "ОС Архитектура",
                "ОС Версия",
                "ОЗУ Mб",
                "Системная плата",
                "Серийный номер",
                "Дисковый накопитель",
                "Network Adapter",
                "MAC Address",
                "Принтер",
                "Видеоадаптер",
                "Монитор",
                "Администраторы",
                "Версия Internet Explorer",
                "ОС Версия DirectX",
                "ОС Версия .NET Framework",
                "Установленное ПО");

        return ListMarkersForOptions;
    }

    public static void checkOption(String option, String option2, PC pc) {

        switch (option) {
            case "Домен":
                pc.setDomain(option2);
                break;
            case "Домен Имя пользователя":
                pc.setDomainUserName(option2);
                break;
            case "Домен Адрес":
                pc.setAddress(option2);
                break;
            case "Домен Организация":
                pc.setOrganizationName(option2);
                break;
            case "Домен Подразделение":
                pc.setDepartment(option2);
                break;
            case "Домен Комната":
                pc.setCabinetNumber(option2);
                break;
            case "Домен Тел":
                pc.setPhoneNumber(option2);
                break;
            case "Домен ФИО":
                pc.setFullName(option2);
                break;
            case "Домен Должность":
                pc.setJobTitle(option2);
                break;
            case "ЦПУ Процессор":
                pc.setName(option2);
                break;
            case "ЦПУ Частота":
                pc.setFrequency(option2);
                break;
            case "ЦПУ Разрядность":
                pc.setArchitecture(option2);
                break;
            case "ЦПУ Ядер":
                pc.setCore(Integer.parseInt(option2));
                break;
            case "ЦПУ Потоков":
                pc.setStream(Integer.parseInt(option2));
                break;
            case "ОС":
                pc.setNameCpu(option2);
                break;
            case "ОС Сервисный пакет":
                pc.setSP(option2);
                break;
            case "ОС Архитектура":
                pc.setArchitecture(option2);
                break;
            case "ОС Версия":
                pc.setVersion(option2);
                break;
            case "ОЗУ Mб":
                pc.setRAM(option2);
                break;
            case "Системная плата":
                pc.setPcCase(option2);
                break;
            case "Серийный номер":
                pc.setSerialNumber(option2);
                break;
            case "Дисковый накопитель":
                pc.setDiskDrive(option2);
                break;
            case "Network Adapter":
                pc.setNetworkAdapter(option2);
                break;
            case "MAC Address":
                pc.setMACAddress(option2);
                break;
            case "Принтер":
                pc.setPrinter(option2);
                break;
            case "Видеоадаптер":
                pc.setVideoAdapter(option2);
                break;
            case "Монитор":
                pc.setMonitor(option2);
                break;
            case "Администраторы":
                pc.setAdministrator(option2);
                break;
            case "Версия Internet Explorer":
                pc.setIE(option2);
                break;
            case "ОС Версия DirectX":
                pc.setDirectX(option2);
                break;
            case "ОС Версия .NET Framework":
                pc.setNetFramework(option2);
                break;
            case "Установленное ПО":
                pc.setSoft(option2);
                break;
            default:
                System.out.println("Параметр не найден");
                break;
        }
    }
}
