/*
Copyright 2008-2010 Gephi
Authors : Eduardo Ramos <eduramiba@gmail.com>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.datalaboratory.impl.manipulators.generalactions.ui;

import javax.swing.JPanel;
import org.gephi.datalaboratory.impl.manipulators.generalactions.ClearEdges;
import org.gephi.datalaboratory.spi.DialogControls;
import org.gephi.datalaboratory.spi.Manipulator;
import org.gephi.datalaboratory.spi.ManipulatorUI;

/**
 * UI for ClearEdges GeneralActionsManipulator
 * @author Eduardo Ramos <eduramiba@gmail.com>
 */
public class ClearEdgesUI extends javax.swing.JPanel implements ManipulatorUI {
    ClearEdges manipulator;
    /** Creates new form ClearEdgesUI */
    public ClearEdgesUI() {
        initComponents();
    }

    public void setup(Manipulator m, DialogControls dialogControls) {
        manipulator=(ClearEdges) m;
        deleteDirectedCheckbox.setSelected(manipulator.isDeleteDirected());
        deleteUndirectedChekbox.setSelected(manipulator.isDeleteUndirected());
    }

    public void unSetup() {
        manipulator.setDeleteDirected(deleteDirectedCheckbox.isSelected());
        manipulator.setDeleteUndirected(deleteUndirectedChekbox.isSelected());
    }

    public String getDisplayName() {
        return manipulator.getName();
    }

    public JPanel getSettingsPanel() {
        return this;
    }

    public boolean isModal() {
        return true;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteDirectedCheckbox = new javax.swing.JCheckBox();
        deleteUndirectedChekbox = new javax.swing.JCheckBox();
        descriptionLabel = new javax.swing.JLabel();

        deleteDirectedCheckbox.setText(org.openide.util.NbBundle.getMessage(ClearEdgesUI.class, "ClearEdgesUI.deleteDirectedCheckbox.text")); // NOI18N

        deleteUndirectedChekbox.setText(org.openide.util.NbBundle.getMessage(ClearEdgesUI.class, "ClearEdgesUI.deleteUndirectedChekbox.text")); // NOI18N

        descriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descriptionLabel.setText(org.openide.util.NbBundle.getMessage(ClearEdgesUI.class, "ClearEdgesUI.descriptionLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteDirectedCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteUndirectedChekbox))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteUndirectedChekbox)
                    .addComponent(deleteDirectedCheckbox))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox deleteDirectedCheckbox;
    private javax.swing.JCheckBox deleteUndirectedChekbox;
    private javax.swing.JLabel descriptionLabel;
    // End of variables declaration//GEN-END:variables
}
