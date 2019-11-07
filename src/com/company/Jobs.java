package com.company;

public class Jobs {


    private String company;
    private String jobtitle;
    private int startdate;
    private int enddate;
    private String jobdescription;
    private String Doyouatleasthaveonejob;


    public Jobs() {  // defult constructor created

    }

    public Jobs(String company, String jobtitle, int startdate, int enddate, String jobdescription) {

        this.company = company;
        this.jobtitle = jobtitle;
        this.startdate = startdate;
        this.enddate = enddate;
        this.jobdescription = jobdescription;
        this.Doyouatleasthaveonejob = Doyouatleasthaveonejob;
    }

    public void setCompany(String compnay) {
        this.company = company;
    }

    public String getcompany() {
        return company;
    }

    public void setjobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getjobtitle() {

        return jobtitle;

    }

    public void setstartdate(int startdate) {
        this.startdate = startdate;
    }

    public int getstartdate() {
        return startdate;

    }

    public void setenddate(int startdate) {
        this.startdate = startdate;
    }

    public int getendtdate() {
        return enddate;

    }


    public void setJobdescription(String jobtitle) {
        this.jobdescription = jobdescription;
    }

    public String getJobdescription() {

        return jobdescription;


    }

}
