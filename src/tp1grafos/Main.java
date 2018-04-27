/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1grafos;

import Classes.*;
import IU.*;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AlphaLegends
 */
public class Main extends javax.swing.JFrame {
    MatrizAdjacencia MA = new MatrizAdjacencia();
    ListaAdjacencia[] LA;
    int tipoEstrutura;
    int tipoAresta;
    /**
     * Creates new form Main
     */
   
    
    public Main() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        BuscaemLargura = new javax.swing.JMenuItem();
        BuscaemProfundidade = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Prim = new javax.swing.JMenuItem();
        Kruskal = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Dijkstra = new javax.swing.JMenuItem();
        BellmanFord = new javax.swing.JMenuItem();
        VCaminho = new javax.swing.JMenuItem();
        VConexo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho de Grafos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Guilherme Couto Fernandes       RA 131250671");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Abrir");

        jMenuItem1.setText("Ler Matriz Adjacencia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Ler Lista Adjacencia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Funções");

        jMenu3.setText("Busca");

        BuscaemLargura.setText("Busca em Largura");
        BuscaemLargura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaemLarguraActionPerformed(evt);
            }
        });
        jMenu3.add(BuscaemLargura);

        BuscaemProfundidade.setText("Busca em Profundidade");
        BuscaemProfundidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaemProfundidadeActionPerformed(evt);
            }
        });
        jMenu3.add(BuscaemProfundidade);

        jMenu2.add(jMenu3);

        jMenu4.setText("Arvore Geradora Minima");

        Prim.setText("Prim");
        Prim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimActionPerformed(evt);
            }
        });
        jMenu4.add(Prim);

        Kruskal.setText("Kruskal");
        Kruskal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KruskalActionPerformed(evt);
            }
        });
        jMenu4.add(Kruskal);

        jMenu2.add(jMenu4);

        jMenu5.setText("Caminho Minimo");

        Dijkstra.setText("Dijkstra");
        Dijkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DijkstraActionPerformed(evt);
            }
        });
        jMenu5.add(Dijkstra);

        BellmanFord.setText("Bellman-Ford");
        BellmanFord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BellmanFordActionPerformed(evt);
            }
        });
        jMenu5.add(BellmanFord);

        jMenu2.add(jMenu5);

        VCaminho.setText("Verificação de caminho");
        VCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VCaminhoActionPerformed(evt);
            }
        });
        jMenu2.add(VCaminho);

        VConexo.setText("Verificação de grafo conexo");
        VConexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VConexoActionPerformed(evt);
            }
        });
        jMenu2.add(VConexo);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser file = new JFileChooser();
        file.setDialogTitle("Grafo");
        file.setFileFilter(new FileFilter(){

            @Override
            public boolean accept(File f) {
                return(f.getName().endsWith(".txt") || f.isDirectory());
            }
            
            @Override
            public String getDescription(){
                return "Arquivo de Texto (.txt)";
            }
        });
            
    int opcao = file.showOpenDialog(this); 
    if(opcao == JFileChooser.APPROVE_OPTION){
        Scanner sc = null;
            try {
                sc = new Scanner(file.getSelectedFile());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            MA.LerMatrizAdjacencia(sc);
            MA.ExibirMatrizAdjacencia(MA.getMatriz());
            tipoAresta = MA.getTipoAresta();
            tipoEstrutura = 1;
    }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser file = new JFileChooser();
        file.setDialogTitle("Grafo");
        file.setFileFilter(new FileFilter(){

            @Override
            public boolean accept(File f) {
                return(f.getName().endsWith(".txt") || f.isDirectory());
            }
            
            @Override
            public String getDescription(){
                return "Arquivo de Texto (.txt)";
            }
        });
            
    int opcao = file.showOpenDialog(this);
    
    if(opcao == JFileChooser.APPROVE_OPTION){
        Scanner sc = null;
            try {
                sc = new Scanner(file.getSelectedFile());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            
            LerListaAdjacencia(sc);//le a Lista Adjacencia
            ExibirListaAdjacencia();
            tipoEstrutura = 2;
    }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BuscaemProfundidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaemProfundidadeActionPerformed
        if(tipoEstrutura == 1){
            IUBuscaProfundidade IU = new IUBuscaProfundidade(MA);
            IU.setVisible(true);
        }else if(tipoEstrutura ==2){
            IUBuscaProfundidade IU = new IUBuscaProfundidade(LA);
            IU.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum dado foi carregado");
        }
    }//GEN-LAST:event_BuscaemProfundidadeActionPerformed

    private void BuscaemLarguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaemLarguraActionPerformed
        if(tipoEstrutura == 1){
            IUBuscaLargura IU = new IUBuscaLargura(MA);
            IU.setVisible(true);
        }else if(tipoEstrutura ==2){
            IUBuscaLargura IU = new IUBuscaLargura(LA);
            IU.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum dado foi carregado");
        }
    }//GEN-LAST:event_BuscaemLarguraActionPerformed

    private void KruskalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KruskalActionPerformed
        if(tipoAresta == 0){
            if(tipoEstrutura == 1){
                IUKruskal IU = new IUKruskal(MA);
                IU.setVisible(true);
            }else if(tipoEstrutura ==2){
                IUKruskal IU = new IUKruskal(LA);
                IU.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum dado foi carregado");
            }
        }else JOptionPane.showMessageDialog(null,"Não é possivel gerar arvore minima para digrafo");
    }//GEN-LAST:event_KruskalActionPerformed

    private void PrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimActionPerformed
        if(tipoAresta == 0){
            if(tipoEstrutura == 1){
                IUPrim IU = new IUPrim(MA);
                IU.setVisible(true);
            }else if(tipoEstrutura ==2){
                IUPrim IU = new IUPrim(LA);
                IU.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum dado foi carregado");
            }
        }else JOptionPane.showMessageDialog(null,"Não é possivel gerar arvore minima para digrafo");
    }//GEN-LAST:event_PrimActionPerformed

    private void VCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VCaminhoActionPerformed
        if(tipoEstrutura == 1){
            IUVerificaCaminho IU = new IUVerificaCaminho(MA);
            IU.setVisible(true);
        }else if(tipoEstrutura ==2){
            IUVerificaCaminho IU = new IUVerificaCaminho(LA);
            IU.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum dado foi carregado");
        }
    }//GEN-LAST:event_VCaminhoActionPerformed

    private void DijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DijkstraActionPerformed
        int aux = JOptionPane.showConfirmDialog(null,"Os Grafos são ponderados ?");
        if(aux == 0){
            if(tipoEstrutura == 1){
                IUDijkstra IU = new IUDijkstra(MA);
                IU.setVisible(true);
            }else if(tipoEstrutura ==2){
                IUDijkstra IU = new IUDijkstra(LA);
                IU.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum dado foi carregado");
            }
        }
    }//GEN-LAST:event_DijkstraActionPerformed

    private void BellmanFordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BellmanFordActionPerformed
        int aux = JOptionPane.showConfirmDialog(null,"Os Grafos são ponderados ?");
        if(aux == 0){
            if(tipoEstrutura == 1){
                IUBellman IU = new IUBellman(MA);
                IU.setVisible(true);
            }else if(tipoEstrutura ==2){
                IUBellman IU = new IUBellman(LA);
                IU.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum dado foi carregado");
            }
        }
    }//GEN-LAST:event_BellmanFordActionPerformed

    private void VConexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VConexoActionPerformed
        if(tipoEstrutura == 1){
            IUVerificaConexo IU = new IUVerificaConexo(MA);
            IU.setVisible(true);
        }else if(tipoEstrutura ==2){
            IUVerificaConexo IU = new IUVerificaConexo(LA);
            IU.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum dado foi carregado");
        }
    }//GEN-LAST:event_VConexoActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BellmanFord;
    private javax.swing.JMenuItem BuscaemLargura;
    private javax.swing.JMenuItem BuscaemProfundidade;
    private javax.swing.JMenuItem Dijkstra;
    private javax.swing.JMenuItem Kruskal;
    private javax.swing.JMenuItem Prim;
    private javax.swing.JMenuItem VCaminho;
    private javax.swing.JMenuItem VConexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables

     public void LerListaAdjacencia(Scanner sc){
        
        tipoAresta = sc.nextInt();
        int nVertices = sc.nextInt();
        
        //arraylist
        LA = new ListaAdjacencia[nVertices];
        

        for(int i = 0; i < nVertices; i++){
        LA[i] = new ListaAdjacencia();
        }
        LA[0].setTipoAresta(tipoAresta);
        
        int vertice1;
        int vertice2;
        int peso;

        if(tipoAresta == 0){//é um grafo, marcar ida e volta
            while(sc.hasNext()){
                int aux;
                //ida
                vertice1 = sc.nextInt();
                vertice2 = sc.nextInt();
                peso = sc.nextInt();
                
                LA[vertice1].setVertice(vertice1);
                LA[vertice1].AdicionarVertice(vertice2,peso);

                //volta
                aux = vertice1;
                vertice1 = vertice2;
                vertice2 = aux;

                LA[vertice1].setVertice(vertice1);
                LA[vertice1].AdicionarVertice(vertice2,peso);
            }
        }else if(tipoAresta == 1){//é um digrafo, possui orientação, marcar só ida
                while(sc.hasNext()){
                    vertice1 = sc.nextInt();
                    vertice2 = sc.nextInt();
                    peso = sc.nextInt();
                    
                    LA[vertice1].setVertice(vertice1);
                    LA[vertice1].AdicionarVertice(vertice2,peso);
                }        
        }       
    }
    
    private void ExibirListaAdjacencia() {
       for(int i=0;i<LA.length;i++){
           System.out.print(LA[i].exibir());
       }
    }
}
