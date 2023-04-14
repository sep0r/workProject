package org.example.model;

import org.apache.commons.compress.harmony.pack200.CpBands;

import java.util.ArrayList;
import java.util.List;

public class PC {
    private String namePc;
    private String Ip;
    private String domain;
    private String nameUser;
    private String domainUserName;
    private String address;
    private String organizationName;
    private String department;
    private String cabinetNumber;
    private String phoneNumber;
    private String fullName;
    private String jobTitle;
    private String name;
    private String SP;
    private String architecture;
    private String version;
    private String RAM;
    private String PcCase;
    private String serialNumber;
    private String IE;
    private String directX;
    private String netFramework;
    private String nameCpu;
    private String frequency;
    private int core;
    private int stream;

    private List<String> diskDrive = new ArrayList<>();
    private List<String> networkAdapter = new ArrayList<>();
    private List<String> MACAddress = new ArrayList<>();
    private List<String> printer = new ArrayList<>();
    private List<String> videoAdapter = new ArrayList<>();
    private List<String> monitor = new ArrayList<>();
    private List<String> administrator = new ArrayList<>();
    private List<String> soft = new ArrayList<>();

    public PC() {
    }

    public PC(String namePcDomain) {
        this.namePc = namePcDomain;
    }

    public PC(String namePc, String Ip, String nameUser) {
        this.namePc = namePc;
        this.Ip = Ip;
        this.nameUser = nameUser;
    }


    public String getNamePc() {
        return namePc;
    }

    public void setNamePc(String namePc) {
        this.namePc = namePc;
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String ip) {
        this.Ip = ip;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getDomainUserName() {
        return domainUserName;
    }

    public void setDomainUserName(String domainUserName) {
        this.domainUserName = domainUserName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCabinetNumber() {
        return cabinetNumber;
    }

    public void setCabinetNumber(String cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSP() {
        return SP;
    }

    public void setSP(String SP) {
        this.SP = SP;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getPcCase() {
        return PcCase;
    }

    public void setPcCase(String PcCase) {
        this.PcCase = PcCase;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setMACAddress(String MACAddress) {
        this.MACAddress.add(MACAddress);
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public String getDirectX() {
        return directX;
    }

    public void setDirectX(String directX) {
        this.directX = directX;
    }

    public String getNetFramework() {
        return netFramework;
    }

    public void setNetFramework(String netFramework) {
        this.netFramework = netFramework;
    }

    public List<String> getDiskDrive() {
        return diskDrive;
    }

    public void setDiskDrive(String diskDrive) {
        this.diskDrive.add(diskDrive);
    }

    public List<String> getNetworkAdapter() {
        return networkAdapter;
    }

    public void setNetworkAdapter(String networkAdapter) {
        this.networkAdapter.add(networkAdapter);
    }

    public List<String> getPrinter() {
        return printer;
    }

    public void setPrinter(String printer) {
        this.printer.add(printer);
    }

    public List<String> getVideoAdapter() {
        return videoAdapter;
    }

    public void setVideoAdapter(String videoAdapter) {
        this.videoAdapter.add(videoAdapter);
    }

    public List<String> getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor.add(monitor);
    }

    public List<String> getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator.add(administrator);
    }

    public List<String> getSoft() {
        return soft;
    }

    public void setSoft(String soft) {
        this.soft.add(soft);
    }

    public String getNameCpu() {
        return nameCpu;
    }

    public void setNameCpu(String nameCpu) {
        this.nameCpu = nameCpu;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public int getStream() {
        return stream;
    }

    public void setStream(int stream) {
        this.stream = stream;
    }

    @Override
    public String toString() {
        return "PC{" +
                "namePc='" + namePc + '\'' +
                ", Ip='" + Ip + '\'' +
                ", domain='" + domain + '\'' +
                ", nameUser='" + nameUser + '\'' +
                ", domainUserName='" + domainUserName + '\'' +
                ", address='" + address + '\'' +
                ", organizationName='" + organizationName + '\'' +
                ", department='" + department + '\'' +
                ", cabinetNumber='" + cabinetNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", SP='" + SP + '\'' +
                ", architecture='" + architecture + '\'' +
                ", version='" + version + '\'' +
                ", RAM='" + RAM + '\'' +
                ", PcCase='" + PcCase + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", IE='" + IE + '\'' +
                ", directX='" + directX + '\'' +
                ", netFramework='" + netFramework + '\'' +
                ", nameCpu='" + nameCpu + '\'' +
                ", frequency='" + frequency + '\'' +
                ", core=" + core +
                ", stream=" + stream +
                ", diskDrive=" + diskDrive +
                ", networkAdapter=" + networkAdapter +
                ", MACAddress=" + MACAddress +
                ", printer=" + printer +
                ", videoAdapter=" + videoAdapter +
                ", monitor=" + monitor +
                ", administrator=" + administrator +
                ", soft=" + soft +
                '}';
    }
}
