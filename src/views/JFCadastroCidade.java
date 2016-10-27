package views;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.dao.CidadeDao;
import model.bean.Cidade;
/**
 *
 * @author enaldo.souza <enaldo@unitri.edu.br>
 */
public class JFCadastroCidade extends javax.swing.JFrame {

    /**
     * Creates new form JFCadastroCidade
     */
    public JFCadastroCidade() {

        initComponents();
        
        jCBestados.addItem("ESCOLHA");
        jCBestados.addItem("ACRE (RIO BRANCO)");
        jCBestados.addItem("ALAGOAS (MACEIÓ)");
        jCBestados.addItem("AMAPÁ (MACAPÁ)");
        jCBestados.addItem("AMAZONAS (MANAUS)");
        jCBestados.addItem("BAHIA (SALVADOR)");
        jCBestados.addItem("CEARÁ (FORTALEZA)");
        jCBestados.addItem("DISTRITO FEDERAL (BRASÍLIA)");
        jCBestados.addItem("ESPÍRITO SANTO (VITÓRIA)");
        jCBestados.addItem("GOIÁS (GOIÂNIA)");
        jCBestados.addItem("MARANHÃO (SÃO LUÍS)");
        jCBestados.addItem("MATO GROSSO (CUIABÁ)");
        jCBestados.addItem("MATO GROSSO DO SUL (CAMPO GRANDE)");
        jCBestados.addItem("MINAS GERAIS (BELO HORIZONTE)");
        jCBestados.addItem("PARÁ (BELÉM)");
        jCBestados.addItem("PARAÍBA (JOÃO PESSOA)");
        jCBestados.addItem("PARANÁ (CURITIBA)");
        jCBestados.addItem("PERNAMBUCO (RECIFE)");
        jCBestados.addItem("PIAUÍ (TERESINA)");
        jCBestados.addItem("RIO DE JANEIRO (RIO DE JANEIRO)");
        jCBestados.addItem("RIO GRANDE DO NORTE (NATAL)");
        jCBestados.addItem("RIO GRANDE DO SUL (PORTO ALEGRE)");
        jCBestados.addItem("RONDÔNIA (PORTO VELHO)");
        jCBestados.addItem("RORAIMA (BOA VISTA)");
        jCBestados.addItem("SANTA CATARINA (FLORIANÓPOLIS)");
        jCBestados.addItem("SÃO PAULO (SÃO PAULO)");
        jCBestados.addItem("SERGIPE (ARACAJU)");
        jCBestados.addItem("TOCANTIS (PALMAS)");
        
        populajTableCidade();
        
        //ordenando jtable
        DefaultTableModel modelo = (DefaultTableModel) jTableCidade.getModel();
        jTableCidade.setRowSorter(new TableRowSorter(modelo));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPcadastroCidade = new javax.swing.JPanel();
        jBinserirCidade = new javax.swing.JButton();
        jBalterarCidade = new javax.swing.JButton();
        jBremoverCidade = new javax.swing.JButton();
        jBlimparCidade = new javax.swing.JButton();
        jBcancelarCidade = new javax.swing.JButton();
        jLcadastroCidade = new javax.swing.JLabel();
        jPdadosCidade = new javax.swing.JPanel();
        jLBnomeCidade = new javax.swing.JLabel();
        jTFnomeCidade = new javax.swing.JTextField();
        jLBestado = new javax.swing.JLabel();
        jCBestados = new javax.swing.JComboBox<>();
        jPtabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCidade = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPcadastroCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBinserirCidade.setText("Inserir");
        jBinserirCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinserirCidadeActionPerformed(evt);
            }
        });

        jBalterarCidade.setText("Alterar");
        jBalterarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarCidadeActionPerformed(evt);
            }
        });

        jBremoverCidade.setText("Remover");
        jBremoverCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBremoverCidadeActionPerformed(evt);
            }
        });

        jBlimparCidade.setText("Limpar");
        jBlimparCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimparCidadeActionPerformed(evt);
            }
        });

        jBcancelarCidade.setText("Cancelar");
        jBcancelarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarCidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPcadastroCidadeLayout = new javax.swing.GroupLayout(jPcadastroCidade);
        jPcadastroCidade.setLayout(jPcadastroCidadeLayout);
        jPcadastroCidadeLayout.setHorizontalGroup(
            jPcadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcadastroCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBinserirCidade)
                .addGap(18, 18, 18)
                .addComponent(jBalterarCidade)
                .addGap(18, 18, 18)
                .addComponent(jBremoverCidade)
                .addGap(18, 18, 18)
                .addComponent(jBlimparCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBcancelarCidade)
                .addContainerGap())
        );
        jPcadastroCidadeLayout.setVerticalGroup(
            jPcadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcadastroCidadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPcadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBinserirCidade)
                    .addComponent(jBalterarCidade)
                    .addComponent(jBremoverCidade)
                    .addComponent(jBlimparCidade)
                    .addComponent(jBcancelarCidade))
                .addContainerGap())
        );

        jLcadastroCidade.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLcadastroCidade.setText("Cadastro de Cidade");

        jPdadosCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLBnomeCidade.setText("Nome Cidade: *");

        jTFnomeCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFnomeCidadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFnomeCidadeKeyTyped(evt);
            }
        });

        jLBestado.setText("Estado: *");

        jCBestados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCOLHA", "ACRE (RIO BRANCO)", "ALAGOAS (MACEIÓ)", "AMAPÁ (MACAPÁ)", "AMAZONAS (MANAUS)", "BAHIA (SALVADOR)", "CEARÁ (FORTALEZA)", "DISTRITO FEDERAL (BRASÍLIA)", "ESPÍRITO SANTO (VITÓRIA)", "GOIÁS (GOIÂNIA)", "MARANHÃO (SÃO LUÍS)", "MATO GROSSO (CUIABÁ)", "MATO GROSSO DO SUL (CAMPO GRANDE)", "MINAS GERAIS (BELO HORIZONTE)", "PARÁ (BELÉM)", "PARAÍBA (JOÃO PESSOA)", "PARANÁ (CURITIBA)", "PERNAMBUCO (RECIFE)", "PIAUÍ (TERESINA)", "RIO DE JANEIRO (RIO DE JANEIRO)", "RIO GRANDE DO NORTE (NATAL)", "RIO GRANDE DO SUL (PORTO ALEGRE)", "RONDÔNIA (PORTO VELHO)", "RORAIMA (BOA VISTA)", "SANTA CATARINA (FLORIANÓPOLIS)", "SÃO PAULO (SÃO PAULO)", "SERGIPE (ARACAJU)", "TOCANTIS (PALMAS)" }));

        javax.swing.GroupLayout jPdadosCidadeLayout = new javax.swing.GroupLayout(jPdadosCidade);
        jPdadosCidade.setLayout(jPdadosCidadeLayout);
        jPdadosCidadeLayout.setHorizontalGroup(
            jPdadosCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPdadosCidadeLayout.createSequentialGroup()
                .addGroup(jPdadosCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPdadosCidadeLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLBnomeCidade))
                    .addGroup(jPdadosCidadeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTFnomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPdadosCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLBestado)
                    .addComponent(jCBestados, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPdadosCidadeLayout.setVerticalGroup(
            jPdadosCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdadosCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPdadosCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBnomeCidade)
                    .addComponent(jLBestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPdadosCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFnomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBestados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPtabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTableCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CIDADE", "ESTADO"
            }
        ));
        jTableCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCidadeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCidade);

        javax.swing.GroupLayout jPtabelaLayout = new javax.swing.GroupLayout(jPtabela);
        jPtabela.setLayout(jPtabelaLayout);
        jPtabelaLayout.setHorizontalGroup(
            jPtabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPtabelaLayout.setVerticalGroup(
            jPtabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPtabelaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLcadastroCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPtabela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPdadosCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPcadastroCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLcadastroCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPcadastroCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPdadosCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPtabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(691, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void populajTableCidade(){
        DefaultTableModel modelo = (DefaultTableModel)jTableCidade.getModel();
        modelo.setNumRows(0);
        CidadeDao cidadeDao = new CidadeDao();
        for(Cidade c: cidadeDao.listaCidades()){
            modelo.addRow(new Object[]{
                c.getCod_cidade(),
                c.getDesc_cidade(),
                c.getEstado_cidade()
            });
        }
    }
    
    
    private void jBinserirCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinserirCidadeActionPerformed
        
        jTFnomeCidade.setEnabled(true);
        jCBestados.setEnabled(true);
        jTFnomeCidade.requestFocus();
        String nome_cidade = jTFnomeCidade.getText().toUpperCase();
        String nome_estado = String.valueOf(jCBestados.getSelectedItem());

        if(nome_estado != "ESCOLHA" && !nome_cidade.isEmpty()){
            try{
                Cidade cidades = new Cidade();
                cidades.setDesc_cidade(nome_cidade);
                cidades.setEstado_cidade(nome_estado);

                CidadeDao createDao = new CidadeDao();
                createDao.create(cidades);
                
                jTFnomeCidade.setText("");
                jCBestados.setSelectedItem("ESCOLHA");
                
                populajTableCidade();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios!", 
                "Aviso", JOptionPane.WARNING_MESSAGE);            
            }
        }else{
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!", 
            "Aviso", JOptionPane.WARNING_MESSAGE);        
        }
    }//GEN-LAST:event_jBinserirCidadeActionPerformed

    private void jBcancelarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarCidadeActionPerformed
        dispose();
    }//GEN-LAST:event_jBcancelarCidadeActionPerformed

    private void jTableCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCidadeMouseClicked

        if(jTableCidade.getSelectedRow() != -1)
            jTFnomeCidade.setText(jTableCidade.getValueAt(jTableCidade.getSelectedRow(),1).toString());
            jCBestados.setSelectedItem(jTableCidade.getValueAt(jTableCidade.getSelectedRow(),2).toString());
                    
    }//GEN-LAST:event_jTableCidadeMouseClicked

    private void jTFnomeCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFnomeCidadeKeyPressed
        //Coloca esse codigo no evento KY PRESSED DO JTextField
        String numCampo = jTFnomeCidade.getText();

        int quantCaracteres = numCampo.length();
        if (quantCaracteres > 30){
            numCampo = numCampo.substring (0, numCampo.length() - 1);
            jTFnomeCidade.setText(numCampo);

        } 
    }//GEN-LAST:event_jTFnomeCidadeKeyPressed

    private void jBalterarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarCidadeActionPerformed
        
        if(jTableCidade.getSelectedRow() != -1 && jTFnomeCidade.getText() != "" 
            && jCBestados.getSelectedItem() != "ESCOLHA"){
//            jTFnomeCidade.setEditable(false);
            if (String.valueOf(jCBestados.getSelectedItem()) != "ESCOLHA"){
                try {
                    Cidade cidade = new Cidade();
                    cidade.setCod_cidade(jTableCidade.getValueAt(jTableCidade.getSelectedRow(),0).toString());
                    cidade.setDesc_cidade(jTFnomeCidade.getText().toUpperCase());
                    cidade.setEstado_cidade(String.valueOf(jCBestados.getSelectedItem()));

                    CidadeDao atualiza = new CidadeDao();
                    atualiza.update(cidade);
                    
                    jTFnomeCidade.setText("");
                    jCBestados.setSelectedItem("ESCOLHA");
                    
                    populajTableCidade();
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios!", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!", "Aviso", JOptionPane.WARNING_MESSAGE);
            }        
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para alteração!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBalterarCidadeActionPerformed

    private void jBremoverCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBremoverCidadeActionPerformed

        if(jTableCidade.getSelectedRow() != -1 && jTFnomeCidade.getText() != "" 
            && jCBestados.getSelectedItem() != "ESCOLHA"){
            Object[] options = { "Sim", "Não" }; 
            int opcao = JOptionPane.showOptionDialog(null, "Confirma exclusão?","Excluir", 
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE , null, options, options[0]);

            if(opcao == 0){    
                if(jTableCidade.getSelectedRow() != -1){
                    Cidade cidade = new Cidade();
                    cidade.setCod_cidade(jTableCidade.getValueAt(jTableCidade.getSelectedRow(), 0).toString());

                    CidadeDao remover = new CidadeDao();
                    remover.delete(cidade);  
                    jTFnomeCidade.setText("");
                    jCBestados.setSelectedItem("ESCOLHA");
                    populajTableCidade();
                }
            }else{
                jTFnomeCidade.setText("");
                jCBestados.setSelectedItem("ESCOLHA");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Escolha Cidade e Estado para remoção!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }        
        
    }//GEN-LAST:event_jBremoverCidadeActionPerformed

    private void jBlimparCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparCidadeActionPerformed

        jTFnomeCidade.setText("");
        jCBestados.setSelectedItem("ESCOLHA");
        
    }//GEN-LAST:event_jBlimparCidadeActionPerformed

    private void jTFnomeCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFnomeCidadeKeyTyped
        char c=evt.getKeyChar();
        if((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }        
    }//GEN-LAST:event_jTFnomeCidadeKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadastroCidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBalterarCidade;
    private javax.swing.JButton jBcancelarCidade;
    private javax.swing.JButton jBinserirCidade;
    private javax.swing.JButton jBlimparCidade;
    private javax.swing.JButton jBremoverCidade;
    private javax.swing.JComboBox<String> jCBestados;
    private javax.swing.JLabel jLBestado;
    private javax.swing.JLabel jLBnomeCidade;
    private javax.swing.JLabel jLcadastroCidade;
    private javax.swing.JPanel jPcadastroCidade;
    private javax.swing.JPanel jPdadosCidade;
    private javax.swing.JPanel jPtabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFnomeCidade;
    private javax.swing.JTable jTableCidade;
    // End of variables declaration//GEN-END:variables
}
