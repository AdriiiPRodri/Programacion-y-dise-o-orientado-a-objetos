/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import napakalaki.Napakalaki;
import napakalaki.CombatResult;
/**
 *
 * @author adrianprodri
 */
public class NapakalakiView extends javax.swing.JFrame {
    private Napakalaki napakalakiModel;
    CombatResult combatResult;
    

    
    public void setNapakalaki(Napakalaki a){
        napakalakiModel = a;
        this.playerView1.setNapakalaki(a);
        this.playerView1.setPlayer(napakalakiModel.getCurrentPlayer());
        this.monsterView1.setMonster(napakalakiModel.getCurrentMonster());
        this.monsterView1.setVisible(false);
        but_next_napa.setEnabled(false);
        but_fight_nap.setEnabled(false);
        meetMonsterButton.setEnabled(true);
        playerView1.MakeButtonEnabled(true);
        repaint();
    }

    /**
     * Creates new form NapakalakiView
     */
    public NapakalakiView() {
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

        p_currPlayer_nap = new javax.swing.JPanel();
        playerView1 = new GUI.PlayerView();
        monster_panel = new javax.swing.JPanel();
        monsterView1 = new GUI.MonsterView();
        pan_but_right = new javax.swing.JPanel();
        meetMonsterButton = new javax.swing.JButton();
        but_fight_nap = new javax.swing.JButton();
        but_next_napa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NAPAKALAKI GAME");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1280, 700));
        getContentPane().setLayout(null);

        p_currPlayer_nap.setBorder(javax.swing.BorderFactory.createTitledBorder("PLAYER"));

        javax.swing.GroupLayout p_currPlayer_napLayout = new javax.swing.GroupLayout(p_currPlayer_nap);
        p_currPlayer_nap.setLayout(p_currPlayer_napLayout);
        p_currPlayer_napLayout.setHorizontalGroup(
            p_currPlayer_napLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_currPlayer_napLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(playerView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        p_currPlayer_napLayout.setVerticalGroup(
            p_currPlayer_napLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_currPlayer_napLayout.createSequentialGroup()
                .addComponent(playerView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        getContentPane().add(p_currPlayer_nap);
        p_currPlayer_nap.setBounds(10, 10, 800, 460);

        monster_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("MONSTER"));

        javax.swing.GroupLayout monster_panelLayout = new javax.swing.GroupLayout(monster_panel);
        monster_panel.setLayout(monster_panelLayout);
        monster_panelLayout.setHorizontalGroup(
            monster_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monster_panelLayout.createSequentialGroup()
                .addComponent(monsterView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );
        monster_panelLayout.setVerticalGroup(
            monster_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monster_panelLayout.createSequentialGroup()
                .addComponent(monsterView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        getContentPane().add(monster_panel);
        monster_panel.setBounds(830, 10, 330, 430);

        meetMonsterButton.setText("DISCOVER");
        meetMonsterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meetMonsterButtonActionPerformed(evt);
            }
        });

        but_fight_nap.setText("FIGHT!");
        but_fight_nap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_fight_napActionPerformed(evt);
            }
        });

        but_next_napa.setText("Next Turn");
        but_next_napa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_next_napaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan_but_rightLayout = new javax.swing.GroupLayout(pan_but_right);
        pan_but_right.setLayout(pan_but_rightLayout);
        pan_but_rightLayout.setHorizontalGroup(
            pan_but_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_but_rightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_but_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(but_next_napa)
                    .addComponent(meetMonsterButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(but_fight_nap, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pan_but_rightLayout.setVerticalGroup(
            pan_but_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_but_rightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pan_but_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(but_fight_nap, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pan_but_rightLayout.createSequentialGroup()
                        .addComponent(meetMonsterButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(but_next_napa)))
                .addContainerGap())
        );

        getContentPane().add(pan_but_right);
        pan_but_right.setBounds(870, 450, 230, 88);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meetMonsterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meetMonsterButtonActionPerformed
        // TODO add your handling code here:
        if(monsterView1.isVisible()){
            monsterView1.setVisible(false);}
        else
            monsterView1.setVisible(true);
        
        meetMonsterButton.setEnabled(false);
        but_fight_nap.setEnabled(true);
        but_next_napa.setEnabled(true);
        meetMonsterButton.setEnabled(false);
        playerView1.MakeButtonEnabled(false);
    }//GEN-LAST:event_meetMonsterButtonActionPerformed

    private void but_fight_napActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_fight_napActionPerformed
        // TODO add your handling code here:
        combatResult= napakalakiModel.developCombat();
        
        switch (combatResult) {
            case WINGAME : 
              
              break;
            case WIN :
                DialogCombatWin dialogWin= new DialogCombatWin(this, true);
                dialogWin.setVisible(true);
                dialogWin.setLocationRelativeTo(this);
                setNapakalaki(napakalakiModel);
                meetMonsterButton.setEnabled(false);
              break;
            case LOSE:
                DialogCombatLose dialogLose= new DialogCombatLose(this, true);
                dialogLose.setLocationRelativeTo(this);
                dialogLose.setVisible(true);
                playerView1.PendingBad();
              break;
            case LOSEANDCONVERT :
                DialogCombatLose dialogLoseConvert= new DialogCombatLose(this, true);
                dialogLoseConvert.setVisible(true);
                dialogLoseConvert.setLocationRelativeTo(this);
              break;
          }
        //setNapakalaki(napakalakiModel);
        but_next_napa.setEnabled(true);
        but_fight_nap.setEnabled(false);
        playerView1.StealButtonEnabled(true);
    }//GEN-LAST:event_but_fight_napActionPerformed

    private void but_next_napaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_next_napaActionPerformed
        if(!napakalakiModel.nextTurn()){
            DialogTurnNotAllowed dialogTurnNotAllowed= new DialogTurnNotAllowed(this, true);
            dialogTurnNotAllowed.setVisible(true);
            dialogTurnNotAllowed.setLocationRelativeTo(this);
        }
        else{
            setNapakalaki(napakalakiModel);
            playerView1.StealButtonEnabled(true);
            playerView1.PendingBad();
        }
    }//GEN-LAST:event_but_next_napaActionPerformed

    /**
     * @param args the command line arguments
     */
    public void showView(){
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_fight_nap;
    private javax.swing.JButton but_next_napa;
    private javax.swing.JButton meetMonsterButton;
    private GUI.MonsterView monsterView1;
    private javax.swing.JPanel monster_panel;
    private javax.swing.JPanel p_currPlayer_nap;
    private javax.swing.JPanel pan_but_right;
    private GUI.PlayerView playerView1;
    // End of variables declaration//GEN-END:variables
}
