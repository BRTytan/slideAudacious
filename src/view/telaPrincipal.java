package view;
public class telaPrincipal extends javax.swing.JFrame {
    public telaPrincipal() {
        initComponents();
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new telaPrincipal().setVisible(true);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPaneBotoes = new javax.swing.JPanel();
        btPlay1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanelLogo.setBackground(new java.awt.Color(0, 0, 255));
        jPanelLogo.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanelLogo.setPreferredSize(new java.awt.Dimension(300, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telaPrincipal.png"))); // NOI18N

        javax.swing.GroupLayout jPanelLogoLayout = new javax.swing.GroupLayout(jPanelLogo);
        jPanelLogo.setLayout(jPanelLogoLayout);
        jPanelLogoLayout.setHorizontalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogoLayout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(148, 148, 148))
        );
        jPanelLogoLayout.setVerticalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPaneBotoes.setBackground(new java.awt.Color(255, 51, 102));
        jPaneBotoes.setMaximumSize(new java.awt.Dimension(300, 300));
        jPaneBotoes.setPreferredSize(new java.awt.Dimension(300, 300));

        btPlay1.setContentAreaFilled(false);
        btPlay1.setBorderPainted(false);
        btPlay1.setBackground(new java.awt.Color(0, 0, 0));
        btPlay1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/png/064-play button.png"))); // NOI18N
        btPlay1.setFocusPainted(false);
        btPlay1.setMaximumSize(new java.awt.Dimension(50, 50));
        btPlay1.setMinimumSize(new java.awt.Dimension(50, 50));
        btPlay1.setPreferredSize(new java.awt.Dimension(50, 50));
        btPlay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlay1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaneBotoesLayout = new javax.swing.GroupLayout(jPaneBotoes);
        jPaneBotoes.setLayout(jPaneBotoesLayout);
        jPaneBotoesLayout.setHorizontalGroup(
            jPaneBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPlay1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
        jPaneBotoesLayout.setVerticalGroup(
            jPaneBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneBotoesLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btPlay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(jPaneBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPaneBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPlay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlay1ActionPerformed
           new telaCadastro().setVisible(true);
           dispose();
           
    }//GEN-LAST:event_btPlay1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPlay1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPaneBotoes;
    private javax.swing.JPanel jPanelLogo;
    // End of variables declaration//GEN-END:variables
}
