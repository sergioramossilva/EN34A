package br.com.gstok.utilidades;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelaModelo extends AbstractTableModel {

    private String[] nomeColunas;
    private List<? extends Object> linhas;

    /**
     * Obtem a quantidade de linhas da tabela.
     * 
     * @return linhas.
     */
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
