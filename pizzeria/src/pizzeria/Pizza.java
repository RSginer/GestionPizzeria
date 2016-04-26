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
import java.util.stream.Collector;
import java.util.stream.Stream;

/**
 *
 * @author daw1
 */
public class Pizza {

    // PRECIOS QUE SE PUEDEN CAMBIAR
    //ingredientes
    double precioJamon = 0.5;
    double precioOlivas = 1;
    double precioCebolla = 2.5;
    double precioTomate = 1.5;
    double precioQueso = 1.5;
    //masa
    double precioMasaIntegral = 9.5;
    double precioMasaNormal = 9;
    //tipo pizza
    double precioBasica = 3;
    double precioCuatroQuesos = 5;
    double precioBarbacoa = 7;
    double precioMexicana = 7;
    // FIN PRECIOS QUE SE PUEDEN CAMBIAR
    int contador = 0;
    double precioTipoPizza;
    double precioIngredientes = 0;
    double total;
    String totalFormat;
    double masa;
    String nombreMasa;
    String tipo;
    String tamaño;
    List<String> listaIngredientes;

    Pizza(double masa, String tipo, String tamaño, List listaIngredientes) {
        this.masa = masa;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.listaIngredientes = listaIngredientes;
    }

    public double calculaMasa(String tipo) {
        this.nombreMasa = tipo;
        double respuesta = 0;
        if (tipo.equalsIgnoreCase("normal")) {
            respuesta = this.precioMasaNormal;
        } else if (tipo.equalsIgnoreCase("integral")) {
            respuesta = this.precioMasaIntegral;
        }
        return respuesta;
    }

    public double calculaIngredientes() {
        this.precioIngredientes = 0;
        for (String ingrediente : listaIngredientes) {
            switch (ingrediente) {
                case "Jamon":
                    this.precioIngredientes += this.precioJamon;
                    break;
                case "Olivas":
                    this.precioIngredientes += this.precioOlivas;
                    break;
                case "Cebolla":
                    this.precioIngredientes += this.precioCebolla;
                    break;
                case "Tomate":
                    this.precioIngredientes += this.precioTomate;
                    break;
                case "Queso":
                    this.precioIngredientes += this.precioQueso;
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
                precioTipoPizza = this.precioBasica;
                break;
            }
            case "Cuatro Quesos": {
                precioTipoPizza = this.precioCuatroQuesos;
                break;
            }
            case "Barbacoa": {
                precioTipoPizza = this.precioBarbacoa;
                break;
            }
            case "Mexicana": {
                precioTipoPizza = this.precioMexicana;
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

    public String generarTicket() throws IOException {
        boolean generado = false;
        String nombreticket = null;
        try (BufferedWriter ticket = new BufferedWriter(new FileWriter("ticket-" + this.contador + ".txt"))) {
            ticket.write(this.pedido());
            nombreticket = "ticket-" + this.contador + ".txt";
            ticket.close();
            this.contador++;
            generado = true;
        } catch (IOException ex) {
            Logger.getLogger(UX.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombreticket;
    }

    public boolean cargarPrecios(String rutaArchivo) {
        boolean cargado = false;
        try {
            try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String[] trozos = linea.split(":");
                    for (String trozo : trozos) {
                        String componente = trozos[0];
                        double precio = Double.parseDouble(trozos[1]);
                        if (componente.equalsIgnoreCase("Basica")) {
                            this.precioBasica = precio;
                            cargado = true;
                        } else if (componente.equalsIgnoreCase("CuatroQuesos")) {
                            this.precioCuatroQuesos = precio;
                            cargado = true;
                        } else if (componente.equalsIgnoreCase("Barbacoa")) {
                            this.precioBarbacoa = precio;
                            cargado = true;
                        } else if (componente.equalsIgnoreCase("Mexicana")) {
                            this.precioMexicana = precio;
                            cargado = true;
                        } else if (componente.equalsIgnoreCase("Normal")) {
                            this.precioMasaNormal = precio;
                            cargado = true;
                        } else if (componente.equalsIgnoreCase("Integral")) {
                            this.precioMasaIntegral = precio;
                            cargado = true;
                        } else if (componente.equalsIgnoreCase("Jamon")) {
                            this.precioJamon = precio;
                            cargado = true;
                        } else if (componente.equalsIgnoreCase("Olivas")) {
                            this.precioOlivas = precio;
                            cargado = true;
                        } else if (componente.equalsIgnoreCase("Cebolla")) {
                            this.precioCebolla = precio;
                            cargado = true;
                        } else if (componente.equalsIgnoreCase("Tomate")) {
                            this.precioTomate = precio;
                            cargado = true;
                        } else if (componente.equalsIgnoreCase("Queso")) {
                            this.precioQueso = precio;
                            cargado = true;
                        }
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {

        }
        
        return cargado;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String pedido() {
        LocalDate hoy = LocalDate.now();
        String ingredientes = null;
        if (this.listaIngredientes.isEmpty() | this.listaIngredientes.contains("Sin ingrediente extra")) {
            ingredientes = "Ninguno";
        } else {
            ingredientes = this.listaIngredientes.toString();
        }
        String texto = "PIZZERIA MISLATA - " + hoy + "\r\n" + "-------------------------------------------------" + "\r\n" + "Masa: " + " " + this.nombreMasa + " € - " + this.masa + "\r\n" + "Tipo: " + " " + this.precioTipoPizza + "€ - " + this.tipo + "\r\n" + "Ingredientes extra: " + " " + this.precioIngredientes + "€ - " + ingredientes + "\r\n" + "Tamaño: " + this.tamaño + "\r\n" + "TOTAL: " + this.totalFormat + " €";
        return texto;
    }

}
