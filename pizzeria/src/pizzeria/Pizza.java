/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daw1
 */
public class Pizza {
    
    double precioTipoPizza;
    double precioIngredientes = 0;
    double total;
    String totalFormat;
    double masa;
    String tipo;
    String tamaño;
    List<String> listaIngredientes;
    
    Pizza(double masa, String tipo, String tamaño, List listaIngredientes) {
        this.masa = masa;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.listaIngredientes = listaIngredientes;
    }
    
    public double calculaIngredientes() {
        this.precioIngredientes = 0;
        for (String ingrediente : listaIngredientes) {
            switch (ingrediente) {
                case "Jamon":
                    this.precioIngredientes += 0.5;
                    break;
                case "Olivas":
                    this.precioIngredientes += 1;
                    break;
                case "Cebolla":
                    this.precioIngredientes += 2.5;
                    break;
                case "Tomate":
                    this.precioIngredientes += 1.5;
                    break;
                case "Queso":
                    this.precioIngredientes += 0.75;
                    break;
            }
        }
        return this.precioIngredientes;
    }
    
    public void setListaIngredientes(List<String> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
    
    public double calculaTipo() {
        switch (this.tipo) {
            case "Basica": {
                precioTipoPizza = 3;
                break;
            }
            case "Cuatro Quesos": {
                precioTipoPizza = 5;
                break;
            }
            case "Barbacoa": {
                precioTipoPizza = 7;
                break;
            }
            case "Mexicana": {
                precioTipoPizza = 8.5;
                break;
            }
        }
        return precioTipoPizza;
    }

    public void calcularPrecio() {
        switch (this.tamaño) {
            case "Pequeña":
                this.total = (this.masa + this.precioTipoPizza + this.precioIngredientes);
                break;
            case "Mediana":
                this.total = (this.masa + this.precioTipoPizza + this.precioIngredientes) * 1.15;
                break;
            case "Familiar":
                this.total = (this.masa + this.precioTipoPizza + this.precioIngredientes) * 1.30;
                break;
        }
        DecimalFormat format = new DecimalFormat("##.##");
        this.totalFormat = format.format(this.total) + "";
    }
    
    public double getPrecioTipoPizza() {
        return precioTipoPizza;
    }
    
    public void setPrecioTipoPizza(double precioTipoPizza) {
        this.precioTipoPizza = precioTipoPizza;
    }
    
    public double getPrecioIngredientes() {
        return precioIngredientes;
    }
    
    public void setPrecioIngredientes(double precioIngredientes) {
        this.precioIngredientes = precioIngredientes;
    }
    
    public double getMasa() {
        return masa;
    }
    
    public void setMasa(double masa) {
        this.masa = masa;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTamaño() {
        return tamaño;
    }

    public boolean generarTicket() throws IOException{
        int contador=1;
        boolean generado = false;
        String nombreticket = "ticket-" + contador + ".txt";
             try (BufferedWriter ticket = new BufferedWriter(new FileWriter(nombreticket))) {
            ticket.write(this.pedido());
            ticket.close();
            contador++;
            generado=true;
         } catch (IOException ex) {
            Logger.getLogger(UX.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        return generado;
    }
    public boolean cargarPrecios(String rutaArchivo){
        try {
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pizza.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return false;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String pedido() {
        LocalDate hoy = LocalDate.now();
        String masa = null;
        String ingredientes = null;
        if (this.masa == 9) {
            masa = "Normal";
        } else if (this.masa == 9.5) {
            masa = "Integral";
        }
        if (this.listaIngredientes.isEmpty() | this.listaIngredientes.contains("Sin ingrediente extra")) {
            ingredientes = "Ninguno";
        } else {
            ingredientes = this.listaIngredientes.toString();
        }
        String texto = "PIZZERIA MISLATA - " + hoy + "\n" + "-------------------------------------------------" + "\n" + "Masa: " + " " + this.masa + "€ - " + masa + "\n" + "Tipo: " + " " + this.precioTipoPizza + "€ - " + this.tipo + "\n" + "Ingredientes extra: " + " " + this.precioIngredientes + "€ - " + ingredientes + "\n" + "Tamaño: " + this.tamaño + "\n" + "TOTAL: " + this.totalFormat + " €";
        return texto;
    }


}
