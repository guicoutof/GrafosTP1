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
public class IUPrim extends javax.swing.JFrame {
    ArrayList<Integer> fila = new ArrayList <>();
    private int tipoEstrutura;
    private MatrizAdjacencia MA;
    ListaAdjacencia[] LA;
    int tipoAresta;
    /**
     * Creates new form IUKruskal
     */
    public IUPrim() {
        initComponents();
    }
    
    public IUPrim(MatrizAdjacencia MA) {
        initComponents();
        this.MA = MA;
        tipoEstrutura = 1;
        tipoAresta = MA.getTipoAresta();
        
    }
    
    public IUPrim(ListaAdjacencia[] LA) {
        initComponents();
        this.LA = LA;
        tipoEstrutura = 2;
        tipoAresta = LA[0].getTipoAresta();
        
    }
    
    public boolean vazio(int[] Q){
        for(int i=0;i<Q.length;i++){
            if(Q[i] == 0)return false;
        }
        return true;
    }
    
    public int extrairMinimo(int[] Q,int[] chave){
        int menor = Integer.MAX_VALUE;
        int vertice = 0;
        for(int i=0;i<Q.length;i++){
            if(Q[i]==0 && chave[i]<menor){
                menor = chave[i];
                vertice = i;
            }
        }
        Q[vertice] = 1;
        return vertice;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Descoberta = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Descoberta.setColumns(20);
        Descoberta.setRows(5);
        jScrollPane1.setViewportView(Descoberta);

        jButton1.setText("Gerar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(tipoAresta==0){
            if(tipoEstrutura == 1){
                String msg = "";   
                msg = PrimMatriz();
                Descoberta.setText(msg);
            }else if(tipoEstrutura == 2){
                String msg = "";   
                msg = PrimLista();
                Descoberta.setText(msg);
            }else JOptionPane.showMessageDialog(null,"Grafo nao encontrado");
        }else if(tipoAresta == 1){
            JOptionPane.showMessageDialog(null,"O algoritmo é usado apenas em grafos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public String PrimMatriz(){
        int[][] matriz = MA.getMatriz();
        int[] chave = new int[matriz.length];
        int[] pai = new int[matriz.length];
        int[] visitados = new int[matriz.length];
        String msg = "";
        int u =0;
        int aux=0;
        int raiz = 0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(matriz[i][j] != Integer.MAX_VALUE && aux ==0){// obter o primeiro vertice
                    raiz = i;
                    aux = 1;
                }
        }
        }
        msg+="vertice --(peso)-- vertice \n";
        msg+= "raiz "+raiz;
        for(int i=0;i<chave.length;i++){
            chave[i] = Integer.MAX_VALUE;
            pai[i] = -1;
            visitados[i] = 0;
        }
        chave[raiz] = 0;
        while(!vazio(visitados)){
            u = extrairMinimo(visitados,chave);
            if(pai[u]!=-1){
                msg += " --("+chave[u]+")-- "+u;
            }
            for(int i=0;i<matriz.length;i++){
                if(matriz[u][i]!= Integer.MAX_VALUE){
                    if(visitados[i]==0 && matriz[u][i]<chave[i]){
                            chave[i] = matriz[u][i];
                            pai[i] = u;
                    }
                }
            }
        }
        return msg;
    }
    
    public String PrimLista(){
   
        int[] chave = new int[LA.length];
        int[] pai = new int[LA.length];
        int[] visitados = new int[LA.length];
        String msg = "";
        int u =0;
        int aux=0;
        int raiz = 0;
        for(int i=0;i<LA.length;i++){
            if(LA[i].getVertice() != -1){// obter o primeiro vertice
                raiz = i;
                break;
            }
        }
        msg+="vertice --(peso)-- vertice \n";
        msg+= "raiz "+raiz;
        for(int i=0;i<chave.length;i++){
            chave[i] = Integer.MAX_VALUE;
            pai[i] = -1;
            visitados[i] = 0;
        }
        chave[raiz] = 0;
        while(!vazio(visitados)){
            u = extrairMinimo(visitados,chave);
            if(pai[u]!=-1){
                msg += " --("+chave[u]+")-- "+u;
            }
            ArrayList<Vertice> lista = LA[u].getLista();
            for(int i=0;i<lista.size();i++){
                int k = lista.get(i).getVertice();
                if((visitados[k]==0) && (lista.get(i).getValor()<chave[k])){
                        chave[k] = lista.get(i).getValor();
                        pai[k] = u;
                }
                
            }
        }
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
            java.util.logging.Logger.getLogger(IUPrim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUPrim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUPrim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUPrim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUPrim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Descoberta;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
