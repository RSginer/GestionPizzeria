package pizzeria;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SelectorDeArchivo extends JPanel
                              implements ActionListener {
    static private String newline = "\n";
    private JTextArea log;
    private JFileChooser fc;

    public SelectorDeArchivo() {
        super(new BorderLayout());
        log = new JTextArea(5,20);
        log.setMargin(new Insets(5,5,5,5));
        log.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(log);
        JButton sendButton = new JButton("Seleccionar archivo de precios");
        sendButton.addActionListener(this);
        add(sendButton, BorderLayout.PAGE_START);
        add(logScrollPane, BorderLayout.CENTER);
    }
    public String seleccionar(ActionEvent e) {
        String ruta="";
        if (fc == null) {
            fc = new JFileChooser();
        }
        int returnVal = fc.showDialog(SelectorDeArchivo.this,"Abrir");
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            ruta = file.getPath();
        }
        fc.setSelectedFile(null);
        return ruta;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
