package org.example.Lab10.Data;

public class QueryBuilder {
    private CRUDMode selectedCRUD;

    public CRUDMode getSelectedCRUD() {
        return selectedCRUD;
    }

    public void setSelectedCRUD(CRUDMode selectedCRUD) {
        this.selectedCRUD = selectedCRUD;
    }
}
