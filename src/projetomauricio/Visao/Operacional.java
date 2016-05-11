/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomauricio.Visao;

import Objetos.Equipamento;
import Objetos.Operacao;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import projetomauricio.DAO.CadastraOperacao;
import projetomauricio.DAO.CarregaEquipamento;

/**
 *
 * @author Lucas
 */
public class Operacional extends javax.swing.JFrame {

    /**
     * Creates new form Operacional
     */
    Equipamento equipamento = new Equipamento();
    Double ValorInicial;
    Double ValorFinal;
    Double resultado;
    Double resultadoMedia;

    public Operacional() {
        initComponents();
        CarregaFrota();
        setLocationRelativeTo(null);
        txtMotivo.disable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFrota = new javax.swing.JLabel();
        boxFrota = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtFinal = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblInicial = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAbastecimento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtValorCombustivel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        RadioParada = new javax.swing.JRadioButton();
        txtMotivo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtHorasTrabalhadas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMedia = new javax.swing.JTextField();
        txtlGasto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblEquipamento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        lblFrota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFrota.setText("Frota:");

        boxFrota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxFrotaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Equipamento:");

        try {
            txtFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFinalKeyReleased(evt);
            }
        });

        jLabel4.setText("Horímetro Final:");

        jLabel2.setText("Horímetro Inicial:");

        lblInicial.setBackground(new java.awt.Color(255, 0, 0));
        lblInicial.setText("as");

        jLabel3.setText("Abastecimento:");

        txtAbastecimento.setVerifyInputWhenFocusTarget(false);
        txtAbastecimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAbastecimentoKeyReleased(evt);
            }
        });

        jLabel5.setText("Média:");

        txtValorCombustivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorCombustivelKeyReleased(evt);
            }
        });

        jLabel7.setText("Valor do Combustível R$");

        RadioParada.setText("Parada");
        RadioParada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioParadaActionPerformed(evt);
            }
        });

        jLabel8.setText("Motivo");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtHorasTrabalhadas.setEditable(false);

        jLabel6.setText("Horas Travalhadas:");

        txtMedia.setEditable(false);

        txtlGasto.setEditable(false);

        jLabel9.setText("Gasto Total:");

        lblEquipamento.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RadioParada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFrota)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxFrota, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(txtFinal))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEquipamento))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6)
                                .addComponent(txtAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addComponent(txtHorasTrabalhadas, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtlGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblFrota, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxFrota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorasTrabalhadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtValorCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioParada)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxFrotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxFrotaActionPerformed
        int valor = Integer.parseInt(boxFrota.getSelectedItem().toString());
        CarregaEquipamento(valor);
    }//GEN-LAST:event_boxFrotaActionPerformed

    private void RadioParadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioParadaActionPerformed
        if (RadioParada.isSelected()) {
            txtMotivo.enable();
            txtMotivo.setText("");
        } else {
            txtMotivo.disable();
            txtMotivo.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_RadioParadaActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed

        if (autentica()) {
            Double abastecimento = Double.parseDouble(txtAbastecimento.getText());
            Double horasTrabalhadas = resultado;
            Double gastoTotal = Double.parseDouble(txtlGasto.getText());
            Double valorCombustivel = Double.parseDouble(txtValorCombustivel.getText());
            boolean parada;
            if (RadioParada.isSelected()) {
                parada = true;
            } else {
                parada = false;
            }
            String motivo = txtMotivo.getText();
            Operacao operacao = new Operacao(equipamento, abastecimento, resultado, resultadoMedia, gastoTotal, valorCombustivel, parada, motivo);
            CadastraOperacao dao = new CadastraOperacao();
            dao.CadastraOperação(operacao);
            LimpaCampo();
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente!");
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimpaCampo();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFinalKeyReleased
        calcula();
    }//GEN-LAST:event_txtFinalKeyReleased

    private void txtAbastecimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAbastecimentoKeyReleased

        Double abastecimento = Double.parseDouble(txtAbastecimento.getText());
        resultadoMedia = this.resultado / abastecimento;
        DecimalFormat df = new DecimalFormat("0.##");
        String resultadofinal = df.format(resultadoMedia);
        txtMedia.setText(String.valueOf(resultadofinal));

    }//GEN-LAST:event_txtAbastecimentoKeyReleased

    private void txtValorCombustivelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorCombustivelKeyReleased
        Double combustivel = Double.parseDouble(txtAbastecimento.getText());
        Double valor = Double.parseDouble(txtValorCombustivel.getText());
        DecimalFormat df = new DecimalFormat("0.##");
        String resultadofinal = df.format(combustivel * valor);
        txtlGasto.setText(resultadofinal);
    }//GEN-LAST:event_txtValorCombustivelKeyReleased

    private void CarregaFrota() {
        CarregaEquipamento carega = new CarregaEquipamento();
        List<Equipamento> equipamentos = new ArrayList<>();
        equipamentos = carega.CarregaFrota();
        for (Equipamento equipamento : equipamentos) {
            boxFrota.addItem(equipamento.getFrota());
        }
    }

    private void CarregaEquipamento(int valor) {
        CarregaEquipamento carrega = new CarregaEquipamento();
        List<Equipamento> equipamentos = carrega.CarregaEquipamento(valor);
        equipamento = equipamentos.get(0);
        lblEquipamento.setText(equipamento.getEquipamento());
        lblInicial.setText(String.valueOf(equipamento.getHorimetro()));
        Operacao opera = new Operacao();
        opera.setEquipamento(equipamento);
    }

    private void calcula() {
        ValorInicial = Double.parseDouble(lblInicial.getText());
        ValorFinal = Double.parseDouble(txtFinal.getText());
        resultado = ValorFinal - ValorInicial;
        DecimalFormat df = new DecimalFormat("0.##");
        String teste = df.format(resultado);
        txtHorasTrabalhadas.setText(String.valueOf(teste));
    }

    private void LimpaCampo() {
        txtAbastecimento.setText("");
        txtFinal.setText("");
        txtHorasTrabalhadas.setText("");
        txtMedia.setText("");
        txtMotivo.setText("");
        txtValorCombustivel.setText("");
        txtlGasto.setText("");

    }

    public boolean autentica() {
        boolean autenticado = false;
        if (txtFinal.getText().length() == 10 && ValorInicial <= ValorFinal) {
            if (txtAbastecimento.getText().length() != 0) {
                if (txtValorCombustivel.getText().length() != 0) {
                    if (RadioParada.isSelected() == true && txtMotivo.getText().length() != 0) {
                        autenticado = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Parada foi selecionada, informe o motivo!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Informe o valor do combustível");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Informe á quantidade de combustivel utilizado!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Horímetro inicial é maior que o horímetro final!");
        }
        return autenticado;
    }

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
            java.util.logging.Logger.getLogger(Operacional.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operacional.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operacional.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operacional.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Createand display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operacional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioParada;
    private javax.swing.JComboBox boxFrota;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lblEquipamento;
    private javax.swing.JLabel lblFrota;
    private javax.swing.JLabel lblInicial;
    private javax.swing.JTextField txtAbastecimento;
    private javax.swing.JFormattedTextField txtFinal;
    private javax.swing.JTextField txtHorasTrabalhadas;
    private javax.swing.JTextField txtMedia;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtValorCombustivel;
    private javax.swing.JTextField txtlGasto;
    // End of variables declaration//GEN-END:variables
}
