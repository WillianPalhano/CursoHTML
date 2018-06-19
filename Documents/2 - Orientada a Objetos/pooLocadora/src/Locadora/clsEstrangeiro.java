package Locadora;

import javax.swing.*;

public class clsEstrangeiro {
    private String passaporte;

    public clsEstrangeiro(String pass){
        setPassaporte(pass);
    }
    
    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }
}
