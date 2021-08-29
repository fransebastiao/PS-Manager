/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.psmanager.data;

/**
 *
 * @author Franciel Sebastiao
 */
public class Visitor{
    private String vName;
    private int vId;
    private int vContact;
    private String vEmail;
    private String vAddress;
    private String pName;
    private String vOccupation;
    private String vRelation;
    private String vReason;
    private String vRequest;
    private String vAcknowledgement;
    private String vConsent;
    
    public Visitor(){
        super();
    }
    
    public Visitor(String vName, int vId, int vContact, String vEmail, String vAddress,
                    String pName, String vOccupation, String vRelation,
                    String vReason, String vRequest, String vAcknowledgement, String vConsent){
        this.vName = vName;
        this.vId = vId;
        this.vContact = vContact;
        this.vEmail = vEmail;
        this.vAddress = vAddress;
        this.pName = pName;
        this.vOccupation = vOccupation;
        this.vRelation = vRelation;
        this.vReason = vReason;
        this.vRequest = vRequest;
        this.vAcknowledgement = vAcknowledgement;
        this.vConsent = vConsent;
    }
    
    public String getVName(String vName){
        return vName;
    }
    
    public void setVName(String vName) {
        this.vName = vName;
    }
    
    public int getVId(int vId){
        return vId;
    }
    
    public void setVId(int vId) {
        this.vId = vId;
    }
    
    public int getVContact(int vContact){
        return vContact;
    }
    
    public void setVContact(int vContact) {
        this.vContact = vContact;
    }
    
    public String getVEmail(String vEmail){
        return vEmail;
    }
    
    public void setVEmail(String vEmail) {
        this.vEmail = vEmail;
    }
    
    public String getVAddress(String vAddress){
        return vAddress;
    }
    
    public void setVAddress(String vAddress) {
        this.vAddress = vAddress;
    }
    
    public String getPName(String pName){
        return pName;
    }
    
    public void setPName(String pName) {
        this.pName = pName;
    }
    
    public String getVOccupation(String vOccupation){
        return vOccupation;
    }
    
    public void setVOccupation(String vOccupation) {
        this.vOccupation = vOccupation;
    }
    
    public String getVRelation(String vRelation){
        return vRelation;
    }
    
    public void setVRelation(String vRelation) {
        this.vRelation = vRelation;
    }
    
    public String getVReason(String vReason){
        return vReason;
    }
    
    public void setVReason(String vReason) {
        this.vReason = vReason;
    }
    
    public String getVRequest(String vRequest){
        return vRequest;
    }
    
    public void setVRequest(String vRequest) {
        this.vRequest = vRequest;
    }
    
    public String getVAcknowledgement(String vAcknowledgement){
        return vAcknowledgement;
    }
    
    public void setVAcknowledgement(String vAcknowledgement) {
        this.vAcknowledgement = vAcknowledgement;
    }
    
    public String getVConsent(String vConsent){
        return vConsent;
    }
    
    public void setVConsent(String vConsent) {
        this.vConsent = vConsent;
    }
    
    @Override
    public String toString(){
        return "";
    }    
}
