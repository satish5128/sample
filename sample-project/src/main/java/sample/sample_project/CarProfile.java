package sample.sample_project;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CarProfile implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Boolean hasAlarm;
   private java.lang.Boolean hasGarage;

   private java.lang.Boolean hasnumberplate;

   public CarProfile()
   {
   }

   public java.lang.Boolean getHasAlarm()
   {
      return this.hasAlarm;
   }

   public void setHasAlarm(java.lang.Boolean hasAlarm)
   {
      this.hasAlarm = hasAlarm;
   }

   public java.lang.Boolean getHasGarage()
   {
      return this.hasGarage;
   }

   public void setHasGarage(java.lang.Boolean hasGarage)
   {
      this.hasGarage = hasGarage;
   }

   public java.lang.Boolean getHasnumberplate()
   {
      return this.hasnumberplate;
   }

   public void setHasnumberplate(java.lang.Boolean hasnumberplate)
   {
      this.hasnumberplate = hasnumberplate;
   }

   public CarProfile(java.lang.Boolean hasAlarm, java.lang.Boolean hasGarage,
         java.lang.Boolean hasnumberplate)
   {
      this.hasAlarm = hasAlarm;
      this.hasGarage = hasGarage;
      this.hasnumberplate = hasnumberplate;
   }

}