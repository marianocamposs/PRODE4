public class Partido {

    private String orden;
    private String equipoL;
    private int golesEquipoL;
    private int golesEquipoV;
    private String equipoV;
    public String getLocalEV(){ return localEV;}
    public void setLocalEV(String localEV){ this.localEV = localEV;}

    private String localEV;


    public Partido(String orden, String equipoL, int golesEquipoL, int golesEquipoV, String equipoV, String localEV) {
        this.orden = orden;
        this.equipoL = equipoL;
        this.golesEquipoL = golesEquipoL;
        this.golesEquipoV = golesEquipoV;
        this.equipoV = equipoV;
        this.localEV = localEV;
    }

    public Partido(String orden, String equipoL, int golesEquipoL, int golesEquipoV, String equipoV) {
        this.orden = orden;
        this.equipoL = equipoL;
        this.golesEquipoL = golesEquipoL;
        this.golesEquipoV = golesEquipoV;
        this.equipoV = equipoV;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getEquipoL() {
        return equipoL;
    }

    public void setEquipoL(String equipoL) {
        this.equipoL = equipoL;
    }

    public int getGolesEquipoL() {
        return golesEquipoL;
    }

    public void setGolesEquipoL(int golesEquipoL) {
        this.golesEquipoL = golesEquipoL;
    }

    public int getGolesEquipoV() {
        return golesEquipoV;
    }

    public void setGolesEquipoV(int golesEquipoV) {
        this.golesEquipoV = golesEquipoV;
    }

    public String getEquipoV() {
        return equipoV;
    }

    public void setEquipoV(String equipoV) {
        this.equipoV = equipoV;
    }

    public String toString() {
        return "El resultado del "+ orden + " fue :  "+ localEV +",= "+equipoL + " " + golesEquipoL + "," + equipoV + " " + golesEquipoV;

        }




    }







