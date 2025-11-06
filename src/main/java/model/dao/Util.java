package model.dao;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vanessalagomachado
 */
public class Util {
    public static String formatarDataHora(LocalDateTime data) {
        if (data == null) return "Sem data definida";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return data.format(fmt);
    }
    
    public static boolean validaAno(int ano){
        if(ano >= 1885 && ano  <= 2026){
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Data inválida! Informe data [1985 - 2026]");
            return false;
        }
    }
}
