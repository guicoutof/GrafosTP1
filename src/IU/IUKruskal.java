/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;

import Classes.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AlphaLegends
 */
public class IUKruskal extends javax.swing.JFrame {
    private int tipoEstrutura;
    private MatrizAdjacencia MA;
    ListaAdjacencia[] LA;
    private int tipoAresta;
    /**
     * Creates new form IUKruskal
     */
    public IUKruskal() {
        initComponents();
    }
    
    public IUKruskal(MatrizAdjacencia MA) {
        initComponents();
        this.MA = MA;
        tipoEstrutura = 1;
        tipoAresta = MA.getTipoAresta();
    }
    
    public IUKruskal(ListaAdjacencia[] LA) {
        initComponents();
        this.LA = LA;
        tipoEstrutura = 2;
        tipoAresta = LA[0].getTipoAresta();   
    }
    
     public boolean pertenceArvore(int[] lista,ArrayList<int[]> conjunto){
        for(int i=0;i<conjunto.size();i++){
            int[] x = conjunto.get(i);
            if(lista[0]==x[0] || lista[1]==x[1])return true;
        }
        return false;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descoberta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGM de Kruskal");

        jButton1.setText("Gerar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Descoberta.setColumns(20);
        Descoberta.setRows(5);
        jScrollPane1.setViewportView(Descoberta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(tipoAresta==0){
            if(tipoEstrutura == 1){
                String msg = "";   
                msg = KruskalMatriz();
                Descoberta.setText(msg);
            }else if(tipoEstrutura == 2){
                String msg = "";   
                //msg = KruskalLista();
                Descoberta.setText(msg);
            }else JOptionPane.showMessageDialog(null,"Grafo nao encontrado");
        }else if(tipoAresta == 1){
            JOptionPane.showMessageDialog(null,"O algoritmo é usado apenas em grafos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public String KruskalMatriz(){
        int[][] matriz = MA.getMatriz();
        ArrayList<int[]> conjuntoA = new ArrayList();
        ArrayList<int[]> arvore = new ArrayList();
        String msg = "";
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(matriz[i][j] != Integer.MAX_VALUE){ // criando conjunto das arestas
                    int[] linha = new int[3];
                    linha[0] = i;
                    linha[1] = j;
                    linha[2] = matriz[i][j];
                    conjuntoA.add(linha);
                    
                }
            }
        }
        
        //ordenar
        msg+="vertice --(peso)-- vertice \n";
        
        
        for(int i=0;i<conjuntoA.size();i++){
            if(!pertenceArvore(conjuntoA.get(i),arvore)){
                arvore.add(conjuntoA.get(i));
            }
        }
        
        
        for(int i=0;i<arvore.size();i++){//imprimir
            int[] aux = arvore.get(i);
            msg += aux[0]+" --("+aux[2]+")-- "+aux[1]+" --";
        }
        
        //msg += "\n\n nao esta muito boa !! nao consegui ordenar";
        return msg;
        
    }
    
    public String KruskalLista(){
        ArrayList<int[]> conjuntoA = new ArrayList();
        ArrayList<int[]> arvore = new ArrayList();
        String msg = "";
        
        for(int i=0;i<LA.length;i++){
            ArrayList<Vertice> lista = LA[i].getLista();
            for(int j=0;j<lista.size();j++){
                int[] linha = new int[3];
                    linha[0] = i;
                    linha[1] = lista.get(j).getVertice();
                    linha[2] = lista.get(j).getValor();
                    conjuntoA.add(linha);
            }
        }
        
        
        //ordenar
        
        msg+="vertice --(peso)-- vertice \n";
        
        
        for(int i=0;i<conjuntoA.size();i++){
            if(!pertenceArvore(conjuntoA.get(i),arvore)){
                arvore.add(conjuntoA.get(i));
            }
        }
        
        for(int i=0;i<arvore.size();i++){//imprimir
            int[] aux = arvore.get(i);
            msg += aux[0]+" --("+aux[2]+")-- "+aux[1]+" --";
        }
        
        //msg += "\n\n nao esta muito boa !! nao consegui ordenar";
        return msg;
        
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
            java.util.logging.Logger.getLogger(IUKruskal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUKruskal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUKruskal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUKruskal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUKruskal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Descoberta;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
