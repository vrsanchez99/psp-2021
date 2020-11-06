package Ejercicios_clase.ejerciciosRefuerzo.git_con_java;

import Ejercicios_clase.ejerciciosRefuerzo.git_con_java.MainApp;
import javafx.fxml.FXML;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;

public class Controlador {

    public Controlador(){}

    private MainApp mainApp;

    @FXML
    private
    TableView tabla_commits;

    @FXML
    private
    TableColumn columna_autor;

    @FXML
    private
    TableColumn columna_fecha;

    @FXML
    private
    TableColumn columna_mensaje;


    public MainApp getMainApp() {
        return mainApp;
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public TableView getTabla_commits() {
        return tabla_commits;
    }

    public void setTabla_commits(TableView tabla_commits) {
        this.tabla_commits = tabla_commits;
    }

    public TableColumn getColumna_autor() {
        return columna_autor;
    }

    public void setColumna_autor(TableColumn columna_autor) {
        this.columna_autor = columna_autor;
    }

    public TableColumn getColumna_fecha() {
        return columna_fecha;
    }

    public void setColumna_fecha(TableColumn columna_fecha) {
        this.columna_fecha = columna_fecha;
    }

    public TableColumn getColumna_mensaje() {
        return columna_mensaje;
    }

    public void setColumna_mensaje(TableColumn columna_mensaje) {
        this.columna_mensaje = columna_mensaje;
    }
}
