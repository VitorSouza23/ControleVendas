/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import atores.Comprador;
import atores.Vendedor;
import gerenciador.gerenciadorVenda;
import java.awt.Component;
import java.awt.Container;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import vo.Atacado;
import vo.Serializacao;
import vo.Varejo;
import vo.Venda;

/**
 *
 * @author Cliente
 */
public class InterfControleVendas extends javax.swing.JFrame {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    InterDadosVendedorComprador dvc = new InterDadosVendedorComprador(this, rootPaneCheckingEnabled);
    Venda va;
    Comprador c;
    Vendedor vd;
    

    /**
     * Creates new form InterfControleVendas
     */
    public InterfControleVendas() {
        initComponents();
        Serializacao.carregar();
        this.mostrarTodasVendas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jbGTipoVenda = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfProduto = new javax.swing.JTextField();
        jtfValorBase = new javax.swing.JTextField();
        jsQuantidade = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jrbAtacado = new javax.swing.JRadioButton();
        jrbVarejo = new javax.swing.JRadioButton();
        jbRealizarVenda = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbDadosCompradorVendedor = new javax.swing.JButton();
        jdcData = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlVendas = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        jbMostrarVenAtacado = new javax.swing.JButton();
        jbMostrarVendVarejo = new javax.swing.JButton();
        lbMostTodasVend = new javax.swing.JButton();
        jbMostrarPorNome = new javax.swing.JButton();
        jbMostarPorPeriodo = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Vendas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Controle de Vendas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sobre a Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel1.setText("Data:");

        jLabel2.setText("Produto:");

        jLabel3.setText("Valor Base:");

        jLabel4.setText("Quantidade:");

        jsQuantidade.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel5.setText("Modo de Venda:");

        jbGTipoVenda.add(jrbAtacado);
        jrbAtacado.setText("Atacado");

        jbGTipoVenda.add(jrbVarejo);
        jrbVarejo.setText("Varejo");

        jbRealizarVenda.setForeground(new java.awt.Color(0, 153, 0));
        jbRealizarVenda.setText("Realizar Venda");
        jbRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRealizarVendaActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar Campos");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbDadosCompradorVendedor.setText("Dados Vendedor e Comprador");
        jbDadosCompradorVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDadosCompradorVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jrbAtacado)
                                .addGap(18, 18, 18)
                                .addComponent(jrbVarejo))
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jbDadosCompradorVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(78, 78, 78)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfValorBase, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(jsQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(jtfProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(jdcData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbRealizarVenda)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfValorBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jsQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jbDadosCompradorVendedor)
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAtacado)
                    .addComponent(jrbVarejo))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRealizarVenda)
                    .addComponent(jbLimpar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Vendas realizadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jScrollPane1.setViewportView(jlVendas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jbMostrarVenAtacado.setText("Mostrar Vendas de Atacado");
        jbMostrarVenAtacado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarVenAtacadoActionPerformed(evt);
            }
        });

        jbMostrarVendVarejo.setText("Mostrar Vendas de Varejo");
        jbMostrarVendVarejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarVendVarejoActionPerformed(evt);
            }
        });

        lbMostTodasVend.setText("Mostrar Todas as Vendas");
        lbMostTodasVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbMostTodasVendActionPerformed(evt);
            }
        });

        jbMostrarPorNome.setText("Mostrar por Nome do Produto");
        jbMostrarPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarPorNomeActionPerformed(evt);
            }
        });

        jbMostarPorPeriodo.setText("Mostrar por Período");
        jbMostarPorPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostarPorPeriodoActionPerformed(evt);
            }
        });

        jbFechar.setForeground(new java.awt.Color(255, 0, 0));
        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jbSalvar.setForeground(new java.awt.Color(0, 0, 204));
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbMostrarVenAtacado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMostrarVendVarejo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMostTodasVend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMostrarPorNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMostarPorPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jbMostrarVenAtacado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbMostrarVendVarejo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMostTodasVend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbMostrarPorNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbMostarPorPeriodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbFechar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRealizarVendaActionPerformed
        if (c.isExiste() == false || vd.isExiste() == false) {
            JOptionPane.showMessageDialog(rootPane, "Comprador ou Vendedor não definidos!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            dvc.setVisible(true);
        } else {
            try {
                va = new Venda();
                va.setData((GregorianCalendar) this.jdcData.getCalendar());
                va.setProduto(this.jtfProduto.getText());
                va.setQuantidade((int) this.jsQuantidade.getValue());
                va.setValorBase(Double.parseDouble(this.jtfValorBase.getText()));
                va.setComprador(c);
                va.setVendedor(vd);
                gerenciadorVenda.inserir(va);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro de caracter inválido!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            
        }    

    }//GEN-LAST:event_jbRealizarVendaActionPerformed

    private void jbDadosCompradorVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDadosCompradorVendedorActionPerformed
        
        dvc.setVisible(true);
        if (dvc.confirmarOperacao() == true) {
            try {
                vd = new Vendedor();
                vd.setNome(dvc.getNomeVendedor());
                vd.setCpf(dvc.getCPFVendeor());
                vd.setMatricula(dvc.getMatricula());
                vd.setSalalario(dvc.getSalario());
                vd.setExiste(true);

                c = new Comprador();
                c.setRenda(dvc.getRenda());
                c.setCpf(dvc.getCPFComprador());
                c.setNome(dvc.getNomeComprador());
                c.setExiste(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro de caracter inválido!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            this.mostrarTodasVendas();
        }
    }//GEN-LAST:event_jbDadosCompradorVendedorActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        Serializacao.salvar();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        this.limparCampos(this.jPanel2);
        this.jsQuantidade.setValue(0);
        this.jbGTipoVenda.clearSelection();
        this.jdcData.setCalendar(null);
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbMostrarVenAtacadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarVenAtacadoActionPerformed
        this.jlVendas.setModel(new DefaultListModel());
        if (!gerenciadorVenda.getListaVenda().isEmpty()) {
            gerenciadorVenda.removeAll();
            for (Venda va1 : gerenciadorVenda.getListaVenda()) {
                if (va1 instanceof Atacado) {
                    va1 = new Atacado();
                    
                   gerenciadorVenda.inserir(va1.getProduto() + " Quant: " + va1.getQuantidade() + " Atacado " + sdf.format(va1.getData()) + " Comprador: " + va1.getComprador().getNome()
                            + " Vendedor: " + va1.getVendedor().getNome() + " Valor final: " + Double.toString(va1.calcularVenda()));
                    this.jlVendas.setModel(gerenciadorVenda.getListamostrar());
                }
            }
        }
    }//GEN-LAST:event_jbMostrarVenAtacadoActionPerformed

    private void jbMostrarVendVarejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarVendVarejoActionPerformed
        this.jlVendas.setModel(new DefaultListModel());
        if (!gerenciadorVenda.getListaVenda().isEmpty()) {
            gerenciadorVenda.removeAll();
            for (Venda va1 : gerenciadorVenda.getListaVenda()) {
                if (va1 instanceof Varejo) {

                    va1 = new Varejo();
                    gerenciadorVenda.inserir(va1.getProduto() + " Quant: " + va1.getQuantidade() + " Atacado " + sdf.format(va1.getData()) + " Comprador: " + va1.getComprador().getNome()
                            + " Vendedor: " + va1.getVendedor().getNome() + " Valor final: " + Double.toString(va1.calcularVenda()));
                    this.jlVendas.setModel(gerenciadorVenda.getListamostrar());
                }
            }
        }
    }//GEN-LAST:event_jbMostrarVendVarejoActionPerformed

    private void lbMostTodasVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbMostTodasVendActionPerformed
        this.mostrarTodasVendas();
    }//GEN-LAST:event_lbMostTodasVendActionPerformed

    private void jbMostrarPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarPorNomeActionPerformed
        this.jlVendas.setModel(new DefaultListModel());
        if (!gerenciadorVenda.getListaVenda().isEmpty()) {
            gerenciadorVenda.removeAll();
            for (Venda va1 : gerenciadorVenda.getListaVenda()) {
                if (va1 instanceof Atacado) {
                    va1 = new Atacado();

                    gerenciadorVenda.inserir(va1.getProduto());
                } else {
                    va1 = new Varejo();
                    gerenciadorVenda.inserir(va1.getProduto());
                }
            }
            this.jlVendas.setModel(gerenciadorVenda.getListamostrar());
        }
    }//GEN-LAST:event_jbMostrarPorNomeActionPerformed

    private void jbMostarPorPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostarPorPeriodoActionPerformed
        MostrarPorData mdp = new MostrarPorData(this, rootPaneCheckingEnabled);
        mdp.setVisible(true);


    }//GEN-LAST:event_jbMostarPorPeriodoActionPerformed

    private void limparCampos(Container container) {
        Component components[] = container.getComponents();

        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText(null);
            }
        }
    }
    
    private void mostrarTodasVendas(){
        this.jlVendas.setModel(new DefaultListModel());
        if (!gerenciadorVenda.getListaVenda().isEmpty()) {
            gerenciadorVenda.removeAll();
            for (Venda va1 : gerenciadorVenda.getListaVenda()) {
                if (va1 instanceof Atacado) {
                    va1 = new Atacado();

                    gerenciadorVenda.inserir(va1.getProduto() + " Quant: " + va1.getQuantidade() + " Atacado " + sdf.format(va1.getData()) + " Comprador: " + va1.getComprador().getNome()
                            + " Vendedor: " + va1.getVendedor().getNome() + " Valor final: " + Double.toString(va1.calcularVenda()));
                   
                } else {
                    va1 = new Varejo();
                    gerenciadorVenda.inserir(va1.getProduto() + " Quant: " + va1.getQuantidade() + " Atacado " + sdf.format(va1.getData()) + " Comprador: " + va1.getComprador().getNome()
                            + " Vendedor: " + va1.getVendedor().getNome() + " Valor final: " + Double.toString(va1.calcularVenda()));
                }
            }
            this.jlVendas.setModel(gerenciadorVenda.getListamostrar());
        }else{
            this.jlVendas.setModel(new DefaultListModel());
        }
    }

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
            java.util.logging.Logger.getLogger(InterfControleVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfControleVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfControleVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfControleVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfControleVendas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbDadosCompradorVendedor;
    private javax.swing.JButton jbFechar;
    private javax.swing.ButtonGroup jbGTipoVenda;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbMostarPorPeriodo;
    private javax.swing.JButton jbMostrarPorNome;
    private javax.swing.JButton jbMostrarVenAtacado;
    private javax.swing.JButton jbMostrarVendVarejo;
    private javax.swing.JButton jbRealizarVenda;
    private javax.swing.JButton jbSalvar;
    private com.toedter.calendar.JDateChooser jdcData;
    private javax.swing.JList jlVendas;
    private javax.swing.JRadioButton jrbAtacado;
    private javax.swing.JRadioButton jrbVarejo;
    private javax.swing.JSpinner jsQuantidade;
    private javax.swing.JTextField jtfProduto;
    private javax.swing.JTextField jtfValorBase;
    private javax.swing.JButton lbMostTodasVend;
    // End of variables declaration//GEN-END:variables
}
