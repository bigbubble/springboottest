package me.peabee.dao.model;

public class KbsSubject {
    private Integer id;

    private String subjectName;

    private Integer subjectLibrary;

    private String dictionaryFlag;

    private String state;

    private String subjectType;

    private String multiDealFlag;

    private String kernelSubject;

    private String attributiveId;

    private String rank;

    private String subjectApply;

    private String firstPinYinChar;

    private String kernelFrom;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public Integer getSubjectLibrary() {
        return subjectLibrary;
    }

    public void setSubjectLibrary(Integer subjectLibrary) {
        this.subjectLibrary = subjectLibrary;
    }

    public String getDictionaryFlag() {
        return dictionaryFlag;
    }

    public void setDictionaryFlag(String dictionaryFlag) {
        this.dictionaryFlag = dictionaryFlag == null ? null : dictionaryFlag.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType == null ? null : subjectType.trim();
    }

    public String getMultiDealFlag() {
        return multiDealFlag;
    }

    public void setMultiDealFlag(String multiDealFlag) {
        this.multiDealFlag = multiDealFlag == null ? null : multiDealFlag.trim();
    }

    public String getKernelSubject() {
        return kernelSubject;
    }

    public void setKernelSubject(String kernelSubject) {
        this.kernelSubject = kernelSubject == null ? null : kernelSubject.trim();
    }

    public String getAttributiveId() {
        return attributiveId;
    }

    public void setAttributiveId(String attributiveId) {
        this.attributiveId = attributiveId == null ? null : attributiveId.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getSubjectApply() {
        return subjectApply;
    }

    public void setSubjectApply(String subjectApply) {
        this.subjectApply = subjectApply == null ? null : subjectApply.trim();
    }

    public String getFirstPinYinChar() {
        return firstPinYinChar;
    }

    public void setFirstPinYinChar(String firstPinYinChar) {
        this.firstPinYinChar = firstPinYinChar == null ? null : firstPinYinChar.trim();
    }

    public String getKernelFrom() {
        return kernelFrom;
    }

    public void setKernelFrom(String kernelFrom) {
        this.kernelFrom = kernelFrom == null ? null : kernelFrom.trim();
    }
}