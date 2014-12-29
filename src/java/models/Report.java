package models;
// Generated Nov 12, 2014 12:25:14 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Report generated by hbm2java
 */
public class Report  implements java.io.Serializable {


     private int id;
     private Location location;
     private Date whenDone;
     private String extraInfo;
     private Set<ReportItem> reportItems = new HashSet<ReportItem>(0);

    public Report() {
    }

	
    public Report(int id, Location location, Date whenDone) {
        this.id = id;
        this.location = location;
        this.whenDone = whenDone;
    }
    public Report(int id, Location location, Date whenDone, String extraInfo, Set<ReportItem> reportItems) {
       this.id = id;
       this.location = location;
       this.whenDone = whenDone;
       this.extraInfo = extraInfo;
       this.reportItems = reportItems;
    }
    
    public Report( Location location, Date whenDone, String extraInfo, Set<ReportItem> reportItems) {
       this.location = location;
       this.whenDone = whenDone;
       this.extraInfo = extraInfo;
       this.reportItems = reportItems;
    }
    
    public Report( Location location, Date whenDone, String extraInfo) {
       this.location = location;
       this.whenDone = whenDone;
       this.extraInfo = extraInfo;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Location getLocation() {
        return this.location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    public Date getWhenDone() {
        return this.whenDone;
    }
    
    public void setWhenDone(Date whenDone) {
        this.whenDone = whenDone;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }
    
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }
    public Set<ReportItem> getReportItems() {
        return this.reportItems;
    }
    
    public void setReportItems(Set<ReportItem> reportItems) {
        this.reportItems = reportItems;
    }




}


