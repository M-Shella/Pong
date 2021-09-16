package pong;

public class View extends javax.swing.JFrame {

    public View() {
        initComponents();
        platno2.sekunda();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        platno2 = new pong.Platno();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pong");
        setResizable(false);

        platno2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                platno2ComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout platno2Layout = new javax.swing.GroupLayout(platno2);
        platno2.setLayout(platno2Layout);
        platno2Layout.setHorizontalGroup(
            platno2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        platno2Layout.setVerticalGroup(
            platno2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(platno2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(platno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void platno2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_platno2ComponentAdded
        
    }//GEN-LAST:event_platno2ComponentAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pong.Platno platno2;
    // End of variables declaration//GEN-END:variables
}
