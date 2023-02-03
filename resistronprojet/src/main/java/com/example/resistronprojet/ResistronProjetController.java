package com.example.resistronprojet;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

/**
 * This class defines the name,color and value of all buttons, TextFields and Labels to manage events in the application
 * and set up a method to calculate the result of the combination of the resistor's rings. It then use the setEditable function
 * to make it impossible for the user to edit the results in TextFields.
 * @version  02/02/2023
 * @author Lauriane MAURER, Zina BREXEL, Robin KERVELLA
 */
public class ResistronProjetController {

    //Buttons relative to Ring 1//
    @FXML
    private Button mBlackR1;
    @FXML
    private Button mBrownR1;
    @FXML
    private Button mRedR1;
    @FXML
    private Button mOrangeR1;
    @FXML
    private Button mYellowR1;
    @FXML
    private Button mGreenR1;
    @FXML
    private Button mBlueR1;
    @FXML
    private Button mPurpleR1;
    @FXML
    private Button mGreyR1;
    @FXML
    private Button mWhiteR1;


    //Buttons relative to Ring 2//
    @FXML
    private Button mBlackR2;
    @FXML
    private Button mBrownR2;
    @FXML
    private Button mRedR2;
    @FXML
    private Button mOrangeR2;
    @FXML
    private Button mYellowR2;
    @FXML
    private Button mGreenR2;
    @FXML
    private Button mBlueR2;
    @FXML
    private Button mPurpleR2;
    @FXML
    private Button mGreyR2;
    @FXML
    private Button mWhiteR2;

    //Buttons relative to Ring 3 (Multiplier)//
    @FXML
    private Button mBlackM;
    @FXML
    private Button mBrownM;
    @FXML
    private Button mRedM;
    @FXML
    private Button mOrangeM;
    @FXML
    private Button mYellowM;
    @FXML
    private Button mGreenM;
    @FXML
    private Button mBlueM;
    @FXML
    private Button mPurpleM;
    @FXML
    private Button mGreyM;
    @FXML
    private Button mWhiteM;
    @FXML
    private Button mGoldM;
    @FXML
    private Button mSilverM;

    //Buttons relative to Ring 4 (Tolerance)//

    @FXML
    private Button mBrownT;
    @FXML
    private Button mRedT;
    @FXML
    private Button mGreenT;
    @FXML
    private Button mBlueT;
    @FXML
    private Button mPurpleT;
    @FXML
    private Button mGreyT;
    @FXML
    private Button mGoldT;
    @FXML
    private Button mSilverT;



    //Texts and Labels to display the results//
    @FXML
    private TextField mValueResistance;
    @FXML
    private Label mLabelUnite;
    @FXML
    private TextField mValueTolerance;


    //Text to display the value of the selected button for each ring//
    @FXML
    private TextField mValueRing1;
    @FXML
    private TextField mValueRing2;
    @FXML
    private TextField mValueRing3;
    @FXML
    private TextField mValueRing4;


    //Labels to display the Colors of each rings on the resistance diagram//
    @FXML
    private Label ColorRing1;
    @FXML
    private Label ColorRing2;
    @FXML
    private Label ColorRing3;
    @FXML
    private Label ColorRing4;


    //Activation of color buttons of Ring1 to select color of Ring 1 on the diagram//
    //Value of the selected button will be display at the end of the Ring1 buttons line//


    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mBlackR1Action() {
        ColorRing1.setBackground(Background.fill(Color.BLACK));
        resistronprojetApplication.value1 =0;
        mValueRing1.setText(resistronprojetApplication.value1 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mBrownR1Action() {
        ColorRing1.setBackground(Background.fill(Color.BROWN));
        resistronprojetApplication.value1 =1;
        mValueRing1.setText(resistronprojetApplication.value1 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mRedR1Action() {
        ColorRing1.setBackground(Background.fill(Color.RED));
        resistronprojetApplication.value1 =2;
        mValueRing1.setText(resistronprojetApplication.value1 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mOrangeR1Action() {
        ColorRing1.setBackground(Background.fill(Color.ORANGE));
        resistronprojetApplication.value1 =3;
        mValueRing1.setText(resistronprojetApplication.value1 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mYellowR1Action() {
        ColorRing1.setBackground(Background.fill(Color.YELLOW));
        resistronprojetApplication.value1 =4;
        mValueRing1.setText(resistronprojetApplication.value1 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mGreenR1Action() {
        ColorRing1.setBackground(Background.fill(Color.GREEN));
        resistronprojetApplication.value1 =5;
        mValueRing1.setText(resistronprojetApplication.value1 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mBlueR1Action() {
        ColorRing1.setBackground(Background.fill(Color.BLUE));
        resistronprojetApplication.value1 =6;
        mValueRing1.setText(resistronprojetApplication.value1 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mPurpleR1Action() {
        ColorRing1.setBackground(Background.fill(Color.PURPLE));
        resistronprojetApplication.value1 =7;
        mValueRing1.setText(resistronprojetApplication.value1 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mGreyR1Action() {
        ColorRing1.setBackground(Background.fill(Color.GREY));
        resistronprojetApplication.value1 =8;
        mValueRing1.setText(resistronprojetApplication.value1 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mWhiteR1Action() {
        ColorRing1.setBackground(Background.fill(Color.WHITE));
        resistronprojetApplication.value1 =9;
        mValueRing1.setText(resistronprojetApplication.value1 + " ");
        result();
    }

    //Activation of color buttons of Ring2 to select color of Ring 2 on the diagram//
    //Value of the selected button will be display at the end of the Ring2 buttons line//
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mBlackR2Action() {
        ColorRing2.setBackground(Background.fill(Color.BLACK));
        resistronprojetApplication.value2 =0;
        mValueRing2.setText((resistronprojetApplication.value2 + " "));
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mBrownR2Action() {
        ColorRing2.setBackground(Background.fill(Color.BROWN));
        resistronprojetApplication.value2 =1;
        mValueRing2.setText(resistronprojetApplication.value2 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mRedR2Action() {
        ColorRing2.setBackground(Background.fill(Color.RED));
        resistronprojetApplication.value2 =2;
        mValueRing2.setText(resistronprojetApplication.value2 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mOrangeR2Action() {
        ColorRing2.setBackground(Background.fill(Color.ORANGE));
        resistronprojetApplication.value2 =3;
        mValueRing2.setText(resistronprojetApplication.value2 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mYellowR2Action() {
        ColorRing2.setBackground(Background.fill(Color.YELLOW));
        resistronprojetApplication.value2 =4;
        mValueRing2.setText(resistronprojetApplication.value2 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mGreenR2Action() {
        ColorRing2.setBackground(Background.fill(Color.GREEN));
        resistronprojetApplication.value2 =5;
        mValueRing2.setText(resistronprojetApplication.value2 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mBlueR2Action() {
        ColorRing2.setBackground(Background.fill(Color.BLUE));
        resistronprojetApplication.value2 =6;
        mValueRing2.setText(resistronprojetApplication.value2 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mPurpleR2Action() {
        ColorRing2.setBackground(Background.fill(Color.PURPLE));
        resistronprojetApplication.value2 =7;
        mValueRing2.setText(resistronprojetApplication.value2 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mGreyR2Action() {
        ColorRing2.setBackground(Background.fill(Color.GREY));
        resistronprojetApplication.value2 =8;
        mValueRing2.setText(resistronprojetApplication.value2 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mWhiteR2Action() {
        ColorRing2.setBackground(Background.fill(Color.WHITE));
        resistronprojetApplication.value2 =9;
        mValueRing2.setText(resistronprojetApplication.value2 + " ");
        result();
    }


    //Activation of color buttons of Ring3 to select color of Ring 3 on the diagram//
    //Value of the selected button will be display at the end of the Ring3 buttons line//
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mBlackMAction() {
        ColorRing3.setBackground(Background.fill(Color.BLACK));
        resistronprojetApplication.value3 =1;
        mValueRing3.setText(resistronprojetApplication.value3 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mBrownMAction() {
        ColorRing3.setBackground(Background.fill(Color.BROWN));
        resistronprojetApplication.value3 =10;
        mValueRing3.setText(resistronprojetApplication.value3 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mRedMAction() {
        ColorRing3.setBackground(Background.fill(Color.RED));
        resistronprojetApplication.value3 =100;
        mValueRing3.setText(resistronprojetApplication.value3 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mOrangeMAction() {
        ColorRing3.setBackground(Background.fill(Color.ORANGE));
        resistronprojetApplication.value3 =1000;
        mValueRing3.setText(resistronprojetApplication.value3 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mYellowMAction() {
        ColorRing3.setBackground(Background.fill(Color.YELLOW));
        resistronprojetApplication.value3 =10000;
        mValueRing3.setText(resistronprojetApplication.value3 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mGreenMAction() {
        ColorRing3.setBackground(Background.fill(Color.GREEN));
        resistronprojetApplication.value3 =100000;
        mValueRing3.setText(resistronprojetApplication.value3 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mBlueMAction() {
        ColorRing3.setBackground(Background.fill(Color.BLUE));
        resistronprojetApplication.value3 =1000000;
        mValueRing3.setText(resistronprojetApplication.value3 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mPurpleMAction() {
        ColorRing3.setBackground(Background.fill(Color.PURPLE));
        resistronprojetApplication.value3 =10000000;
        mValueRing3.setText(resistronprojetApplication.value3 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mGreyMAction() {
        ColorRing3.setBackground(Background.fill(Color.GREY));
        resistronprojetApplication.value3 =100000000;
        mValueRing3.setText(resistronprojetApplication.value3 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mWhiteMAction() {
        ColorRing3.setBackground(Background.fill(Color.WHITE));
        resistronprojetApplication.value3 =1000000000;
        mValueRing3.setText(resistronprojetApplication.value3 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mGoldMAction() {
        ColorRing3.setBackground(Background.fill(Color.GOLD));
        resistronprojetApplication.value3 =0.1;
        mValueRing3.setText(resistronprojetApplication.value3 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mSilverMAction() {
        ColorRing3.setBackground(Background.fill(Color.SILVER));
        resistronprojetApplication.value3 =0.01;
        mValueRing3.setText(resistronprojetApplication.value3 + " ");
        result();
    }


    //Activation of color buttons of Ring4 to select color of Ring 4 on the diagram//
    //Value of the selected button will be display at the end of the Ring4 buttons line//
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mBrownTAction() {
        ColorRing4.setBackground(Background.fill(Color.BROWN));
        resistronprojetApplication.value4 =1;
        mValueRing4.setText(resistronprojetApplication.value4 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mRedTAction() {
        ColorRing4.setBackground(Background.fill(Color.RED));
        resistronprojetApplication.value4 =2;
        mValueRing4.setText(resistronprojetApplication.value4 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mGreenTAction() {
        ColorRing4.setBackground(Background.fill(Color.GREEN));
        resistronprojetApplication.value4 =0.5;
        mValueRing4.setText(resistronprojetApplication.value4 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mBlueTAction() {
        ColorRing4.setBackground(Background.fill(Color.BLUE));
        resistronprojetApplication.value4 =0.25;
        mValueRing4.setText(resistronprojetApplication.value4 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mPurpleTAction() {
        ColorRing4.setBackground(Background.fill(Color.PURPLE));
        resistronprojetApplication.value4 =0.10;
        mValueRing4.setText(resistronprojetApplication.value4 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mGreyTAction() {
        ColorRing4.setBackground(Background.fill(Color.GREY));
        resistronprojetApplication.value4 =0.05;
        mValueRing4.setText(resistronprojetApplication.value4 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mGoldTAction() {
        ColorRing4.setBackground(Background.fill(Color.GOLD));
        resistronprojetApplication.value4 =5;
        mValueRing4.setText(resistronprojetApplication.value4 + " ");
        result();
    }
    /**
     * Set the color of the named button then gives it a value according to its color and ring position.
     */
    public void mSilverTAction() {
        ColorRing4.setBackground(Background.fill(Color.SILVER));
        resistronprojetApplication.value4 =10;
        mValueRing4.setText(resistronprojetApplication.value4 + " ");
        result();
    }

    //We have to calculate now the value of the resistance//

    /**
     * Display the result of the calculation for each ring of the resistor,
     * then automatically converts the Ohm units into Ohm, kOhm, MOhm or GOhm according to the value
     * returned by the method.
     * */
    @FXML
    public void result()   {

        String txtUnit = null;

        double resistanceValue = (resistronprojetApplication.value1*10 + resistronprojetApplication.value2)*(resistronprojetApplication.value3);

            if(resistanceValue <1000) {
            resistanceValue = resistanceValue;
            txtUnit = " Ω";
            }else if(resistanceValue <1000000){
            resistanceValue = (resistanceValue/1000);
            txtUnit = " kΩ";
            }else if(resistanceValue <1000000000) {
            resistanceValue = (resistanceValue / 1000000);
         txtUnit = " MΩ";
            }else if(resistanceValue > (1000000000)) {
            resistanceValue = (resistanceValue / 1000000000);
            txtUnit = " GΩ";
            }

        double toleranceValue = (resistronprojetApplication.value4);


        // We display now results in corresponding Textfields and labels.

        mValueResistance.setText(resistanceValue + " ");
        mValueTolerance.setText(String.valueOf(resistronprojetApplication.value4));
        mLabelUnite.setText(txtUnit);


        // Textfield have to be not editable after displaying results.//

        mValueResistance.setEditable(false);
        mValueTolerance.setEditable(false);

    }
}
