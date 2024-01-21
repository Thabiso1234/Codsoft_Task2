
package masukuTR;

import javax.swing.JOptionPane;


public class GuiClass {
    private double apsScore;
    private double average;
    private String symbol;
    private String afrikaansMark;
    private String englishMark;
    private String mathMark;
    private String lifeOrientationMark;
    private String businessMark;
    private String physicsMark;
    private String geographyMark;
    private int afrLevel,engLevel,mathLevel,loLevel,businessLevel,physicsLevel,geoLevel;


    public GuiClass() {
        this.apsScore = apsScore;
        this.average = average;
        this.symbol = symbol;
        this.afrikaansMark = afrikaansMark;
        this.englishMark = englishMark;
        this.mathMark = mathMark;
        this.lifeOrientationMark = lifeOrientationMark;
        this.businessMark = businessMark;
        this.physicsMark = physicsMark;
        this.geographyMark = geographyMark;
    }

    

    public void setAfrikaansMark(String afrikaansMark) {
        this.afrikaansMark = afrikaansMark;
    }

    public void setEnglishMark(String englishMark) {
        this.englishMark = englishMark;
    }

    public void setMathMark(String mathMark) {
        this.mathMark = mathMark;
    }

    public void setLifeOrientationMark(String lifeOrientationMark) {
        this.lifeOrientationMark = lifeOrientationMark;
    }

    public void setBusinessMark(String businessMark) {
        this.businessMark = businessMark;
    }

    public void setPhysicsMark(String physicsMark) {
        this.physicsMark = physicsMark;
    }

    public void setGeographyMark(String geographyMark) {
        this.geographyMark = geographyMark;
    }
   
    public double getApsScore() {
        return apsScore;
    }

    public void setApsScore(double apsScore) {
        this.apsScore = apsScore;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setAfrLevel(int afrLevel) {
        this.afrLevel = afrLevel;
    }

    public void setEngLevel(int engLevel) {
        this.engLevel = engLevel;
    }

    public void setMathLevel(int mathLevel) {
        this.mathLevel = mathLevel;
    }

    public void setLoLevel(int loLevel) {
        this.loLevel = loLevel;
    }

    public void setBusinessLevel(int businessLevel) {
        this.businessLevel = businessLevel;
    }

    public void setPhysicsLevel(int physiscsLevel) {
        this.physicsLevel = physicsLevel;
    }

    public void setGeoLevel(int geoLevel) {
        this.geoLevel = geoLevel;
    }

    public String getAfrikaansMark() {
        return afrikaansMark;
    }

    public String getEnglishMark() {
        return englishMark;
    }

    public String getMathMark() {
        return mathMark;
    }

    public String getLifeOrientationMark() {
        return lifeOrientationMark;
    }

    public String getBusinessMark() {
        return businessMark;
    }

    public String getPhysicsMark() {
        return physicsMark;
    }

    public String getGeographyMark() {
        return geographyMark;
    }

    public int getAfrLevel() {
        return afrLevel;
    }

    public int getEngLevel() {
        return engLevel;
    }

    public int getMathLevel() {
        return mathLevel;
    }

    public int getLoLevel() {
        return loLevel;
    }

    public int getBusinessLevel() {
        return businessLevel;
    }

    public int getPhysicsLevel() {
        return physicsLevel;
    }

    public int getGeoLevel() {
        return geoLevel;
    }
    
    
    public void calculate()
            
    {
        
        double afrikaans = Double.parseDouble(afrikaansMark);
        double english = Double.parseDouble(englishMark);
        double math = Double.parseDouble(mathMark);
        double lifeOrientation = Double.parseDouble(lifeOrientationMark);
        double business = Double.parseDouble(businessMark);
        double physics = Double.parseDouble(physicsMark);
        double geography = Double.parseDouble(geographyMark);
        
        apsScore = 0;
        
        average = (afrikaans + english + math + business + physics + lifeOrientation + geography)/ 7;
        int averagePerc = (int) average;
        
        
        if(afrikaans >= 80 && afrikaans <= 100)
        {
          afrLevel = 7;
          apsScore += 7;
        }
        else if( afrikaans >= 70 && afrikaans < 80)
        {
            afrLevel = 6;
           apsScore += 6;
        }
        else if( afrikaans >= 60 && afrikaans < 70)
        {
            afrLevel = 5;
           apsScore += 5;
        }
        else if( afrikaans >= 50 && afrikaans < 60)
        {
            afrLevel = 4;
           apsScore += 4;
        }
        else if( afrikaans >= 40 && afrikaans < 50)
        {
            afrLevel = 3;
           apsScore += 3;
        }
        else if( afrikaans >= 30 && afrikaans < 40)
        {
            afrLevel = 2;
           apsScore += 2;
        }
        else if( afrikaans >= 0 && afrikaans < 30)
        {
            afrLevel = 1;
           apsScore += 1;
        }
        else
         {
            afrLevel = 0;
           apsScore += 0;
         }
         
          
          
            if(english >= 80 && english <= 100)
        {
          engLevel = 7;
          apsScore += 7;
        }
        else if( english >= 70 && english < 80)
        {
            engLevel = 6;
           apsScore += 6;
        }
        else if( english >= 60 && english < 70)
        {
            engLevel = 5;
           apsScore += 5;
        }
        else if( english >= 50 && english < 60)
        {
            engLevel = 4;
           apsScore += 4;
        }
        else if( english >= 40 && english < 50)
        {
            engLevel = 3;
           apsScore += 3;
        }
        else if( english >= 30 && english < 40)
        {
            engLevel = 2;
           apsScore += 2;
        }
        else if( english >= 0 && english < 30)
        {
            engLevel = 1;
           apsScore += 1;
        }
        else
         {
            engLevel = 0;
           apsScore += 0;
         }
        
        if(math >= 80 && math <= 100)
        {
          mathLevel = 7;
          apsScore += 7;
        }
        else if( math >= 70 && math < 80)
        {
            mathLevel = 6;
           apsScore += 6;
        }
        else if( math >= 60 && math < 70)
        {
            mathLevel = 5;
           apsScore += 5;
        }
        else if( math >= 50 && math < 60)
        {
            mathLevel = 4;
           apsScore += 4;
        }
        else if( math >= 40 && math < 50)
        {
           mathLevel = 3;
           apsScore += 3;
        }
        else if( math >= 30 && math < 40)
        {
            mathLevel = 2;
           apsScore += 2;
        }
        else if( math >= 0 && math < 30)
        {
            mathLevel = 1;
           apsScore += 1;
        }
        else
            {
            mathLevel = 0;
           apsScore += 0;
            }
        
        
        if( geography >= 80 && geography <= 100)
        {
          geoLevel = 7;
          apsScore += 7;
        }
        else if( geography >= 70 && geography < 80)
        {
            geoLevel = 6;
           apsScore += 6;
        }
        else if( geography >= 60 && geography < 70)
        {
            geoLevel = 5;
           apsScore += 5;
        }
        else if( geography >= 50 && geography < 60)
        {
            geoLevel = 4;
           apsScore += 4;
        }
        else if( geography >= 40 && geography < 50)
        {
            geoLevel = 3;
           apsScore += 3;
        }
        else if( geography >= 30 && geography < 40)
        {
            geoLevel = 2;
           apsScore += 2;
        }
        else if( geography >= 0 && geography < 30)
        {
            geoLevel = 1;
           apsScore += 1;
        }
        else
        {
            geoLevel = 0;
           apsScore += 0;
        }
        
        if(physics >= 80 && physics <= 100)
        {
          physicsLevel = 7;
          apsScore += 7;
        }
        else if( physics >= 70 && physics < 80)
        {
            physicsLevel = 6;
           apsScore += 6;
        }
        else if( physics >= 60 && physics < 70)
        {
            physicsLevel = 5;
           apsScore += 5;
        }
        else if( physics >= 50 && physics < 60)
        {
            physicsLevel = 4;
           apsScore += 4;
        }
        else if( physics >= 40 && physics < 50)
        {
            physicsLevel = 3;
           apsScore += 3;
        }
        else if( physics >= 30 && physics < 40)
        {
            physicsLevel = 2;
           apsScore += 2;
        }
        else if( physics >= 0 && physics < 30)
        {
            physicsLevel = 1;
           apsScore += 1;
        }
        else
        {
            physicsLevel = 0;
           apsScore += 0;
        }
        
        if(lifeOrientation >= 80 && lifeOrientation <= 100)
        {
          loLevel = 7;
        }
        else if( lifeOrientation >= 70 && lifeOrientation < 80)
        {
            loLevel = 6;
        }
        else if( lifeOrientation >= 60 && lifeOrientation < 70)
        {
            loLevel = 5;
        }
        else if( lifeOrientation >= 50 && lifeOrientation < 60)
        {
            loLevel = 4;
        }
        else if( lifeOrientation >= 40 && lifeOrientation < 50)
        {
            loLevel = 3;
        }
        else if( lifeOrientation >= 30 && lifeOrientation < 40)
        {
            loLevel = 2;
        }
        else if( lifeOrientation >= 0 && lifeOrientation < 30)
        {
            loLevel = 1 ;
        }
        else
        {
            loLevel = 0;
        }
        
          if( business >= 80 && business <= 100)
        {
          businessLevel = 7;
          apsScore += 7;
        }
        else if( business >= 70 && business < 80)
        {
            businessLevel = 6;
           apsScore += 6;
        }
        else if( business >= 60 && business < 70)
        {
            businessLevel = 5;
           apsScore += 5;
        }
        else if( business >= 50 && business < 60)
        {
            businessLevel = 4;
           apsScore += 4;
        }
        else if( business >= 40 && business < 50)
        {
            businessLevel = 3;
           apsScore += 3;
        }
        else if( business >= 30 && business < 40)
        {
           businessLevel = 2;
           apsScore += 2;
        }
        else if( business >= 0 && business < 30)
        {
           businessLevel = 1;
           apsScore += 1;
        }
        else
          {
           businessLevel = 0;
           apsScore += 0;
          }
          
           int aps = (int)apsScore;
          String finalAps = Integer.toString(aps);
       
          
        if(english >= 40 && business >= 50 && geography >= 50 && physics >= 50 && math >= 50 && lifeOrientation >= 30 && afrikaans >= 30)
        {
         symbol = "B";
        }
       else if(english >= 40 && business >= 40 && geography >= 40 && physics >= 40 && math >= 40 && lifeOrientation >= 30 && afrikaans >= 30)
        {
         symbol ="D";
        }
        else if(english >= 40 && business >= 40 && geography >= 40 && physics >= 30 && math >= 30 && lifeOrientation >= 30 && afrikaans >= 30)
        {
         symbol = "HC";
        }
        else if(english >= 0 && business >= 30 && geography >= 30 && physics >= 30 && math >= 30 && lifeOrientation >= 30 && afrikaans >= 30 && average >= 33.5)
        {
         symbol = "NSC";
        }
        else
        {
          symbol = "F";
        }
    
    
       
    
    
    
    
    }
    
}
