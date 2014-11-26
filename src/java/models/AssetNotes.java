package models;
// Generated Nov 12, 2014 12:25:14 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * AssetNotes generated by hbm2java
 */
public class AssetNotes  implements java.io.Serializable {


     private int id;
     private Assets assets;
     private Users users;
     private Date whenCreated;
     private boolean isDamaged;
     private boolean isLost;
     private String reason;

    public AssetNotes() {
    }

	
    public AssetNotes(int id, boolean isDamaged, boolean isLost) {
        this.id = id;
        this.isDamaged = isDamaged;
        this.isLost = isLost;
    }
    public AssetNotes(int id, Assets assets, Users users, Date whenCreated, boolean isDamaged, boolean isLost, String reason) {
       this.id = id;
       this.assets = assets;
       this.users = users;
       this.whenCreated = whenCreated;
       this.isDamaged = isDamaged;
       this.isLost = isLost;
       this.reason = reason;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Assets getAssets() {
        return this.assets;
    }
    
    public void setAssets(Assets assets) {
        this.assets = assets;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public Date getWhenCreated() {
        return this.whenCreated;
    }
    
    public void setWhenCreated(Date whenCreated) {
        this.whenCreated = whenCreated;
    }
    public boolean isIsDamaged() {
        return this.isDamaged;
    }
    
    public void setIsDamaged(boolean isDamaged) {
        this.isDamaged = isDamaged;
    }
    public boolean isIsLost() {
        return this.isLost;
    }
    
    public void setIsLost(boolean isLost) {
        this.isLost = isLost;
    }
    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }




}

