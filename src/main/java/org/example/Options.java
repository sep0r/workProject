package org.example;

public enum Options {
    DOMAIN("Домен"),
    DOMAIN_USER_NAME("Домен Имя пользователя"),
    DOMAIN_ADDRESS("Домен Адрес"),
    DOMAIN_ORGANIZATION("Домен Организация"),
    DOMAIN_DEPARTAMENT("Домен Подразделение"),
    DOMAIN_CABINET_NUMBER("Домен Комната"),
    DOMAIN_PHONE_NUMBER("Домен Тел"),
    DOMAIN_FULL_NAME("Домен ФИО"),
    DOMAIN_JOB_TITLE("Домен Должность"),
    CPU_NAME("ЦПУ Процессор"),
    CPU_FREQUENCY("ЦПУ Частота"),
    CPU_ARCHITECTURE("ЦПУ Разрядность"),
    CPU_CORE("ЦПУ Ядер"),
    CPU_STREAM("ЦПУ Потоков"),
    OS_NAME("ОС"),
    OS_SP("ОС Сервисный пакет"),
    OS_ARCHITECTURE("ОС Архитектура"),
    OS_VERSION("ОС Версия"),
    RAM("ОЗУ Mб"),
    NAME_PC("Системная плата"),
    SERIAL_NUMBER("Серийный номер"),
    DISK_DRIVE("Дисковый накопитель"),
    NETWORK_ADAPTER("Network Adapter"),
    MAC_ADDRESS("MAC Address"),
    PRINTER("Принтер"),
    VIDEO_ADAPTER("Видеоадаптер"),
    MONITOR("Монитор"),
    ADMINISTRATOR("Администраторы"),
    IE("Версия Internet Explorer"),
    DIRECT_X("ОС Версия DirectX"),
    NET_FRAMEWORK("ОС Версия .NET Framework"),
    SOFT("Установленное ПО");

    String nameOption;

    Options() {
    }

    Options(String nameOption) {
        this.nameOption = nameOption;
    }

    public String getNameOption() {
        return nameOption;
    }
}
