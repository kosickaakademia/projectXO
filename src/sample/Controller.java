package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Random;

public class Controller {

private boolean isGameRunning=false;
    public Label lbl_win;
    private int[][] pole={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn10;
    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn14;
    public Button btn15;
    public Button btn16;

    public Controller(){

    }

    public void mix(){
        Random random = new Random();
        for(int i=1;i<=19;i++){
            int num = random.nextInt(16)+1;
            switch(num){
                case 1: btn1_click(null);
                case 2: btn2_click(null);
                case 3: btn3_click(null);
                case 4: btn4_click(null);
                case 5: btn5_click(null);
                case 6: btn6_click(null);
                case 7: btn7_click(null);
                case 8: btn8_click(null);
                case 9: btn9_click(null);
                case 10: btn10_click(null);
                case 11: btn11_click(null);
                case 12: btn12_click(null);
                case 13: btn13_click(null);
                case 14: btn14_click(null);
                case 15: btn15_click(null);
                case 16: btn16_click(null);
            }
            isGameRunning=true;
        }
    }
    public void btn1_click(ActionEvent actionEvent) {
        changeTile(2,0,1);
        changeTile(5,1,0);
        changeTile(6,1,1);
        isWinner();
    }

    public void btn2_click(ActionEvent actionEvent) {
        changeTile(1,0,0);
        changeTile(3,0,2);
        changeTile(5,1,0);
        changeTile(6,1,1);
        changeTile(7,1,2);
        isWinner();
    }

    public void btn3_click(ActionEvent actionEvent) {
        changeTile(2,0,1);
        changeTile(4,0,3);
        changeTile(6, 1,1);
        changeTile(7,1,2);
        changeTile(8, 1,3);
        isWinner();
    }

    public void btn4_click(ActionEvent actionEvent) {
        changeTile(3,0,2);
        changeTile(7,1,2);
        changeTile(8,1,3);
        isWinner();
    }

    public void btn5_click(ActionEvent actionEvent) {
        changeTile(1,0,0);
        changeTile(2,0,1);
        changeTile(6,1,1);
        changeTile(9,2,0);
        changeTile(10,2,1);
        isWinner();
    }

    public void btn6_click(ActionEvent actionEvent) {
        changeTile(1,0,0);
        changeTile(2,0,1);
        changeTile(3,0,2);
        changeTile(5,1,0);
        changeTile(7,1,2);
        changeTile(9,2,0);
        changeTile(10,2,1);
        changeTile(11,2,2);
        isWinner();
    }

    public void btn7_click(ActionEvent actionEvent) {
        changeTile(4,0,3);
        changeTile(2,0,1);
        changeTile(3,0,2);
        changeTile(6,1,1);
        changeTile(8,1,3);
        changeTile(12,2,3);
        changeTile(10,2,1);
        changeTile(11,2,2);
        isWinner();
    }

    public void btn8_click(ActionEvent actionEvent) {
        changeTile(4,0,3);
        changeTile(7,1,2);
        changeTile(3,0,2);
        changeTile(11,2,2);
        changeTile(12,2,3);
        isWinner();
    }

    public void btn9_click(ActionEvent actionEvent) {
        changeTile(5,1,0);
        changeTile(6,1,1);
        changeTile(10,2,1);
        changeTile(13,3,0);
        changeTile(14,3,1);
        isWinner();
    }
    public void btn10_click(ActionEvent actionEvent) {
        changeTile(5,1,0);
        changeTile(6,1,1);
        changeTile(7,1,2);
        changeTile(9,2,0);
        changeTile(11,2,2);
        changeTile(13,3,0);
        changeTile(14,3,1);
        changeTile(15,3,2);
        isWinner();
    }
    public void btn11_click(ActionEvent actionEvent) {
        changeTile(6,1,1);
        changeTile(7,1,2);
        changeTile(8,1,3);
        changeTile(10,2,1);
        changeTile(12,2,3);
        changeTile(14,3,1);
        changeTile(15,3,2);
        changeTile(16,3,3);
        isWinner();
    }
    public void btn12_click(ActionEvent actionEvent) {
        changeTile(7,1,2);
        changeTile(8,1,3);
        changeTile(11,2,2);
        changeTile(15,3,2);
        changeTile(16,3,3);
        isWinner();
    }
    public void btn13_click(ActionEvent actionEvent) {
        changeTile(9,2,0);
        changeTile(10,2,1);
        changeTile(14,3,1);
        isWinner();
    }
    public void btn14_click(ActionEvent actionEvent) {
        changeTile(9,2,0);
        changeTile(10,2,1);
        changeTile(11,2,2);
        changeTile(13,3,0);
        changeTile(15,3,2);
        isWinner();
    }
    public void btn15_click(ActionEvent actionEvent) {
        changeTile(10,2,1);
        changeTile(11,2,2);
        changeTile(12,2,3);
        changeTile(14,3,1);
        changeTile(16,3,3);
        isWinner();
    }
    public void btn16_click(ActionEvent actionEvent) {
        changeTile(11,2,2);
        changeTile(12,2,3);
        changeTile(15,3,2);
        isWinner();
    }


    public void changeTile(int value, int row, int col){
        if(pole[row][col]==0) pole[row][col]=1; else pole[row][col]=0;

        switch(value){
            case 1: if(pole[0][0]==0) btn1.setText("O"); else btn1.setText("X"); break;
            case 2: if(pole[0][1]==0) btn2.setText("O"); else btn2.setText("X"); break;
            case 3: if(pole[0][2]==0) btn3.setText("O"); else btn3.setText("X"); break;
            case 4: if(pole[0][3]==0) btn4.setText("O"); else btn4.setText("X"); break;
            case 5: if(pole[1][0]==0) btn5.setText("O"); else btn5.setText("X"); break;
            case 6: if(pole[1][1]==0) btn6.setText("O"); else btn6.setText("X"); break;
            case 7: if(pole[1][2]==0) btn7.setText("O"); else btn7.setText("X"); break;
            case 8: if(pole[1][3]==0) btn8.setText("O"); else btn8.setText("X"); break;
            case 9: if(pole[2][0]==0) btn9.setText("O"); else btn9.setText("X"); break;
            case 10: if(pole[2][1]==0) btn10.setText("O"); else btn10.setText("X"); break;
            case 11: if(pole[2][2]==0) btn11.setText("O"); else btn11.setText("X"); break;
            case 12: if(pole[2][3]==0) btn12.setText("O"); else btn12.setText("X"); break;
            case 13: if(pole[3][0]==0) btn13.setText("O"); else btn13.setText("X"); break;
            case 14: if(pole[3][1]==0) btn14.setText("O"); else btn14.setText("X"); break;
            case 15: if(pole[3][2]==0) btn15.setText("O"); else btn15.setText("X"); break;
            case 16: if(pole[3][3]==0) btn16.setText("O"); else btn16.setText("X"); break;
        }

    }

    public boolean isWinner(){
        int sucet=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sucet+=pole[i][j];
            }
        }
        if(isGameRunning==true && (sucet==0 ||sucet ==16)){
            lbl_win.setVisible(true);
        }
        return false;
    }

}
