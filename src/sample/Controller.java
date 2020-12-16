package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {

    private int[][] pole={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;

    public void btn1_click(ActionEvent actionEvent) {
        changeTile(2,0,1);
        changeTile(5,1,0);
        changeTile(6,1,1);
    }

    public void btn2_click(ActionEvent actionEvent) {
        changeTile(1,0,0);
        changeTile(3,0,2);
        changeTile(5,1,0);
        changeTile(6,1,1);
        changeTile(7,1,2);
    }

    public void btn3_click(ActionEvent actionEvent) {
        changeTile(2,0,1);
        changeTile(4,0,3);
        changeTile(6, 1,1);
        changeTile(7,1,2);
        changeTile(8, 1,3);
    }

    public void btn4_click(ActionEvent actionEvent) {
        changeTile(3,0,2);
        changeTile(7,1,2);
        changeTile(8,1,3);
    }

    public void btn5_click(ActionEvent actionEvent) {
        changeTile(1,0,0);
        changeTile(2,0,1);
        changeTile(6,1,1);

    }

    public void btn6_click(ActionEvent actionEvent) {
    }

    public void btn7_click(ActionEvent actionEvent) {
    }

    public void btn8_click(ActionEvent actionEvent) {
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
        }

    }
}
