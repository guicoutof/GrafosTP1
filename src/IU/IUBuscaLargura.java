/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;

import Classes.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AlphaLegends
 */
public class IUBuscaLargura extends javax.swing.JFrame {
    ArrayList<Integer> fila = new ArrayList <>();
    private int tipoEstrutura;
    private MatrizAdjacencia MA;
    ListaAdjacencia[] LA;
    
    public IUBuscaLargura() {
        initComponents();
        Descoberta.setText("");
    }
    
    public IUBuscaLargura(MatrizAdjacencia MA) {
        initComponents();
        Descoberta.setText("");
        this.MA = MA;
        tipoEstrutura = 1;
        
    }
    
    public IUBuscaLargura(ListaAdjacencia[] LA) {
        initComponents();
        Descoberta.setText("");
        this.LA = LA;
        tipoEstrutura = 2;
        
    }
    
    public void enfileira(int vert){
        fila.add(vert);
    }
    
    private int desenfileira(){
        int v = fila.get(0);
        fila.remove(0);
        return v;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Buscar = new javax.swing.JButton();
        Raiz = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        descoberta = new javax.swing.JLabel();
        Descoberta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca em Largura");

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nó Raiz");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vertice", "Distancia", "Pai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Caminho de Descoberta: ");

        Descoberta.setText("caminho");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(descoberta, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Buscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(Descoberta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Descoberta))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(descoberta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
       if(tipoEstrutura==1){
            BuscaLarguraMatriz();
        }else if(tipoEstrutura == 2){
            BuscaProfundidadeLista();
        }
    }//GEN-LAST:event_BuscarActionPerformed

    
    public void BuscaLarguraMatriz(){
        int raiz = Integer.valueOf(Raiz.getText());
        int[][] matriz = MA.getMatriz();
        int[] cor = new int[matriz.length];
        int[] d = new int[matriz.length];
        int[] pai = new int[matriz.length];
        String msg = "";
        
        for(int i=0;i<cor.length;i++){
            cor[i] = 0; //0 = branco
            d[i] = Integer.MAX_VALUE;
            pai[i] = -1;
        }
        cor[raiz] = 1;//cinza
        d[raiz] = 0;
        pai[raiz] = -1;
        msg += raiz+ " ";
        enfileira(raiz);
        while(!fila.isEmpty()){
            int u = desenfileira();
            for(int j=0;j<matriz.length;j++){
                if(matriz[u][j]!=Integer.MAX_VALUE){
                    if(cor[j]==0){
                        cor[j]=1;//cinza
                        d[j] = d[u]+1;
                        pai[j] = u;
                        msg += j+ " ";
                        enfileira(j);
                    }
                }
            }
            cor[u] = 2;//preto   
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(int i=0;i<d.length;i++){
            Object[] linha = new Object[3];
            linha[0] = i;
            linha[1] = d[i];
            linha[2] = pai[i];
            model.addRow(linha);

        }
        Descoberta.setText(msg);
    }
    
    
    public void BuscaProfundidadeLista(){
        int raiz = Integer.valueOf(Raiz.getText());
        int[] cor = new int[LA.length];
        int[] d = new int[LA.length];
        int[] pai = new int[LA.length];
        String msg = "";
        
        for(int i=0;i<cor.length;i++){
            cor[i] = 0; //0 = branco
            d[i] = Integer.MAX_VALUE;
            pai[i] = -1;
        }
        cor[raiz] = 1;//cinza
        d[raiz] = 0;
        pai[raiz] = -1;
        msg += raiz+ " ";
        enfileira(raiz);
        while(!fila.isEmpty()){
            int u = desenfileira();
            ArrayList<Vertice> lista = LA[u].getLista();
            for(int i=0;i<lista.size();i++){
                int j = lista.get(i).getVertice();
                if(cor[j]==0){
                    cor[j]=1;//cinza
                    d[j] = d[u]+1;
                    pai[j] = u;
                    msg += j+ " ";
                    enfileira(j);
                }    
            }
            cor[u] = 2;//preto   
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(int i=0;i<d.length;i++){
            Object[] linha = new Object[3];
            linha[0] = i;
            linha[1] = d[i];
            linha[2] = pai[i];
            model.addRow(linha);

        }
        Descoberta.setText(msg);
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
            java.util.logging.Logger.getLogger(IUBuscaLargura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUBuscaLargura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUBuscaLargura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUBuscaLargura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUBuscaLargura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel Descoberta;
    private javax.swing.JTextField Raiz;
    private javax.swing.JLabel descoberta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

