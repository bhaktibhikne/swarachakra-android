package iit.android.language;
import iit.android.language.Language;
import iit.android.swarachakra.KeyAttr;

import java.util.ArrayList;
import java.util.HashMap;

import android.annotation.SuppressLint;

public class MainLanguage extends Language{

    public MainLanguage() {
        name = "tamil";
        symbol = "tam";
        nKeys = 88;
        myKey = new ArrayList<KeyAttr>(nKeys);
        defaultChakra = new String[] {"\u0BBE", "\u0BBF", "\u0BC0", "\u0BC1", "\u0BC2", "\u0BC6", "\u0BC7", "\u0BC8", "\u0BCA", "\u0BCB"};
        halantExists =  false;
        halantEnd = 35;

        KeyAttr tempKey = new KeyAttr();
        for (int i=0; i < nKeys; i++ ) {
            myKey.add(i, tempKey);
        }

        KeyAttr myKey0 = new KeyAttr();
        myKey0.code = 1;
        myKey0.label = "\u0B95" ;
        myKey0.showChakra = true ;
        myKey0.showCustomChakra = false ;
        myKey0.customChakraLayout = new String[] {} ;
        myKey0.showIcon = false ;
        myKey0.icon = "";
        myKey0.changeLayout = false ;
        myKey0.layout = "";
        myKey.set(0, myKey0);

        KeyAttr myKey1 = new KeyAttr();
        myKey1.code = 2;
        myKey1.label = "\u0B99" ;
        myKey1.showChakra = true ;
        myKey1.showCustomChakra = false ;
        myKey1.customChakraLayout = new String[] {} ;
        myKey1.showIcon = false ;
        myKey1.icon = "";
        myKey1.changeLayout = false ;
        myKey1.layout = "";
        myKey.set(1, myKey1);

        KeyAttr myKey2 = new KeyAttr();
        myKey2.code = 3;
        myKey2.label = "\u0B9A" ;
        myKey2.showChakra = true ;
        myKey2.showCustomChakra = false ;
        myKey2.customChakraLayout = new String[] {} ;
        myKey2.showIcon = false ;
        myKey2.icon = "";
        myKey2.changeLayout = false ;
        myKey2.layout = "";
        myKey.set(2, myKey2);

        KeyAttr myKey3 = new KeyAttr();
        myKey3.code = 4;
        myKey3.label = "\u0B9E" ;
        myKey3.showChakra = true ;
        myKey3.showCustomChakra = false ;
        myKey3.customChakraLayout = new String[] {} ;
        myKey3.showIcon = false ;
        myKey3.icon = "";
        myKey3.changeLayout = false ;
        myKey3.layout = "";
        myKey.set(3, myKey3);

        KeyAttr myKey4 = new KeyAttr();
        myKey4.code = 5;
        myKey4.label = "\u0B9F" ;
        myKey4.showChakra = true ;
        myKey4.showCustomChakra = false ;
        myKey4.customChakraLayout = new String[] {} ;
        myKey4.showIcon = false ;
        myKey4.icon = "";
        myKey4.changeLayout = false ;
        myKey4.layout = "";
        myKey.set(4, myKey4);

        KeyAttr myKey5 = new KeyAttr();
        myKey5.code = 6;
        myKey5.label = "\u0BA3" ;
        myKey5.showChakra = true ;
        myKey5.showCustomChakra = false ;
        myKey5.customChakraLayout = new String[] {} ;
        myKey5.showIcon = false ;
        myKey5.icon = "";
        myKey5.changeLayout = false ;
        myKey5.layout = "";
        myKey.set(5, myKey5);

        KeyAttr myKey6 = new KeyAttr();
        myKey6.code = 7;
        myKey6.label = "\u0BA4" ;
        myKey6.showChakra = true ;
        myKey6.showCustomChakra = false ;
        myKey6.customChakraLayout = new String[] {} ;
        myKey6.showIcon = false ;
        myKey6.icon = "";
        myKey6.changeLayout = false ;
        myKey6.layout = "";
        myKey.set(6, myKey6);

        KeyAttr myKey7 = new KeyAttr();
        myKey7.code = 8;
        myKey7.label = "\u0BA8" ;
        myKey7.showChakra = true ;
        myKey7.showCustomChakra = false ;
        myKey7.customChakraLayout = new String[] {} ;
        myKey7.showIcon = false ;
        myKey7.icon = "";
        myKey7.changeLayout = false ;
        myKey7.layout = "";
        myKey.set(7, myKey7);

        KeyAttr myKey8 = new KeyAttr();
        myKey8.code = 9;
        myKey8.label = "\u0BAA" ;
        myKey8.showChakra = true ;
        myKey8.showCustomChakra = false ;
        myKey8.customChakraLayout = new String[] {} ;
        myKey8.showIcon = false ;
        myKey8.icon = "";
        myKey8.changeLayout = false ;
        myKey8.layout = "";
        myKey.set(8, myKey8);

        KeyAttr myKey9 = new KeyAttr();
        myKey9.code = 10;
        myKey9.label = "\u0BAE" ;
        myKey9.showChakra = true ;
        myKey9.showCustomChakra = false ;
        myKey9.customChakraLayout = new String[] {} ;
        myKey9.showIcon = false ;
        myKey9.icon = "";
        myKey9.changeLayout = false ;
        myKey9.layout = "";
        myKey.set(9, myKey9);

        KeyAttr myKey10 = new KeyAttr();
        myKey10.code = 11;
        myKey10.label = "\u0BAF" ;
        myKey10.showChakra = true ;
        myKey10.showCustomChakra = false ;
        myKey10.customChakraLayout = new String[] {} ;
        myKey10.showIcon = false ;
        myKey10.icon = "";
        myKey10.changeLayout = false ;
        myKey10.layout = "";
        myKey.set(10, myKey10);

        KeyAttr myKey11 = new KeyAttr();
        myKey11.code = 12;
        myKey11.label = "\u0BB0" ;
        myKey11.showChakra = true ;
        myKey11.showCustomChakra = false ;
        myKey11.customChakraLayout = new String[] {} ;
        myKey11.showIcon = false ;
        myKey11.icon = "";
        myKey11.changeLayout = false ;
        myKey11.layout = "";
        myKey.set(11, myKey11);

        KeyAttr myKey12 = new KeyAttr();
        myKey12.code = 13;
        myKey12.label = "\u0BB2" ;
        myKey12.showChakra = true ;
        myKey12.showCustomChakra = false ;
        myKey12.customChakraLayout = new String[] {} ;
        myKey12.showIcon = false ;
        myKey12.icon = "";
        myKey12.changeLayout = false ;
        myKey12.layout = "";
        myKey.set(12, myKey12);

        KeyAttr myKey13 = new KeyAttr();
        myKey13.code = 14;
        myKey13.label = "\u0BB5" ;
        myKey13.showChakra = true ;
        myKey13.showCustomChakra = false ;
        myKey13.customChakraLayout = new String[] {} ;
        myKey13.showIcon = false ;
        myKey13.icon = "";
        myKey13.changeLayout = false ;
        myKey13.layout = "";
        myKey.set(13, myKey13);

        KeyAttr myKey14 = new KeyAttr();
        myKey14.code = 15;
        myKey14.label = "\u0BB4" ;
        myKey14.showChakra = true ;
        myKey14.showCustomChakra = false ;
        myKey14.customChakraLayout = new String[] {} ;
        myKey14.showIcon = false ;
        myKey14.icon = "";
        myKey14.changeLayout = false ;
        myKey14.layout = "";
        myKey.set(14, myKey14);

        KeyAttr myKey15 = new KeyAttr();
        myKey15.code = 16;
        myKey15.label = "\u0BB3" ;
        myKey15.showChakra = true ;
        myKey15.showCustomChakra = false ;
        myKey15.customChakraLayout = new String[] {} ;
        myKey15.showIcon = false ;
        myKey15.icon = "";
        myKey15.changeLayout = false ;
        myKey15.layout = "";
        myKey.set(15, myKey15);

        KeyAttr myKey16 = new KeyAttr();
        myKey16.code = 17;
        myKey16.label = "\u0BB1" ;
        myKey16.showChakra = true ;
        myKey16.showCustomChakra = false ;
        myKey16.customChakraLayout = new String[] {} ;
        myKey16.showIcon = false ;
        myKey16.icon = "";
        myKey16.changeLayout = false ;
        myKey16.layout = "";
        myKey.set(16, myKey16);

        KeyAttr myKey17 = new KeyAttr();
        myKey17.code = 18;
        myKey17.label = "\u0BA9" ;
        myKey17.showChakra = true ;
        myKey17.showCustomChakra = false ;
        myKey17.customChakraLayout = new String[] {} ;
        myKey17.showIcon = false ;
        myKey17.icon = "";
        myKey17.changeLayout = false ;
        myKey17.layout = "";
        myKey.set(17, myKey17);

        KeyAttr myKey18 = new KeyAttr();
        myKey18.code = 19;
        myKey18.label = "\u0BBE" ;
        myKey18.showChakra = true ;
        myKey18.showCustomChakra = true ;
        myKey18.customChakraLayout = new String[] {"","\u0BBF","\u0BC0","\u0BC1","\u0BC2","\u0BC6","\u0BC7","\u0BC8","\u0BCA","\u0BCB"} ;//,"\u0BCC"
        myKey18.showIcon = false ;
        myKey18.icon = "";
        myKey18.changeLayout = false ;
        myKey18.layout = "";
        myKey.set(18, myKey18);

        KeyAttr myKey19 = new KeyAttr();
        myKey19.code = 20;
        myKey19.label = "\u0B85" ;
        myKey19.showChakra = true ;
        myKey19.showCustomChakra = true ;
        myKey19.customChakraLayout = new String[] {"\u0B86","\u0B87","\u0B88","\u0B89","\u0B8A","\u0B8E","\u0B8F","\u0B90","\u0B92","\u0B93"} ;
        myKey19.showIcon = false ;
        myKey19.icon = "";
        myKey19.changeLayout = false ;
        myKey19.layout = "";
        myKey.set(19, myKey19);

        KeyAttr myKey20 = new KeyAttr();
        myKey20.code = 21;
        myKey20.label = "\u0B9C" ;
        myKey20.showChakra = true ;
        myKey20.showCustomChakra = false ;
        myKey20.customChakraLayout = new String[] {} ;
        myKey20.showIcon = false ;
        myKey20.icon = "";
        myKey20.changeLayout = false ;
        myKey20.layout = "";
        myKey.set(20, myKey20);

        KeyAttr myKey21 = new KeyAttr();
        myKey21.code = 22;
        myKey21.label = "\u0BB8" ;
        myKey21.showChakra = true ;
        myKey21.showCustomChakra = false ;
        myKey21.customChakraLayout = new String[] {} ;
        myKey21.showIcon = false ;
        myKey21.icon = "";
        myKey21.changeLayout = false ;
        myKey21.layout = "";
        myKey.set(21, myKey21);

        KeyAttr myKey22 = new KeyAttr();
        myKey22.code = 23;
        myKey22.label = "\u0BB7" ;
        myKey22.showChakra = true ;
        myKey22.showCustomChakra = false ;
        myKey22.customChakraLayout = new String[] {} ;
        myKey22.showIcon = false ;
        myKey22.icon = "";
        myKey22.changeLayout = false ;
        myKey22.layout = "";
        myKey.set(22, myKey22);

        KeyAttr myKey23 = new KeyAttr();
        myKey23.code = 24;
        myKey23.label = "\u0BB9" ;
        myKey23.showChakra = true ;
        myKey23.showCustomChakra = false ;
        myKey23.customChakraLayout = new String[] {} ;
        myKey23.showIcon = false ;
        myKey23.icon = "";
        myKey23.changeLayout = false ;
        myKey23.layout = "";
        myKey.set(23, myKey23);

        KeyAttr myKey24 = new KeyAttr();
        myKey24.code = 25;
        myKey24.label = "\u0BB6" ;
        myKey24.showChakra = true ;
        myKey24.showCustomChakra = false ;
        myKey24.customChakraLayout = new String[] {} ;
        myKey24.showIcon = false ;
        myKey24.icon = "";
        myKey24.changeLayout = false ;
        myKey24.layout = "";
        myKey.set(24, myKey24);

        KeyAttr myKey25 = new KeyAttr();
        myKey25.code = 26;
        myKey25.label = "\u0021" ;
        myKey25.showChakra = false ;
        myKey25.showCustomChakra = false ;
        myKey25.customChakraLayout = new String[] {} ;
        myKey25.showIcon = false ;
        myKey25.icon = "";
        myKey25.changeLayout = false ;
        myKey25.layout = "";
        myKey.set(25, myKey25);

        KeyAttr myKey26 = new KeyAttr();
        myKey26.code = 27;
        myKey26.label = "\u003F" ;
        myKey26.showChakra = false ;
        myKey26.showCustomChakra = false ;
        myKey26.customChakraLayout = new String[] {} ;
        myKey26.showIcon = false ;
        myKey26.icon = "";
        myKey26.changeLayout = false ;
        myKey26.layout = "";
        myKey.set(26, myKey26);

        KeyAttr myKey27 = new KeyAttr();
        myKey27.code = 28;
        myKey27.label = "\"" ;
        myKey27.showChakra = false ;
        myKey27.showCustomChakra = false ;
        myKey27.customChakraLayout = new String[] {} ;
        myKey27.showIcon = false ;
        myKey27.icon = "";
        myKey27.changeLayout = false ;
        myKey27.layout = "";
        myKey.set(27, myKey27);

        KeyAttr myKey28 = new KeyAttr();
        myKey28.code = 29;
        myKey28.label = "\u002C" ;
        myKey28.showChakra = false ;
        myKey28.showCustomChakra = false ;
        myKey28.customChakraLayout = new String[] {} ;
        myKey28.showIcon = false ;
        myKey28.icon = "";
        myKey28.changeLayout = false ;
        myKey28.layout = "";
        myKey.set(28, myKey28);

        KeyAttr myKey29 = new KeyAttr();
        myKey29.code = 30;
        myKey29.label = "\u002E" ;
        myKey29.showChakra = false ;
        myKey29.showCustomChakra = false ;
        myKey29.customChakraLayout = new String[] {} ;
        myKey29.showIcon = false ;
        myKey29.icon = "";
        myKey29.changeLayout = false ;
        myKey29.layout = "";
        myKey.set(29, myKey29);

        KeyAttr myKey30 = new KeyAttr();
        myKey30.code = 31;
        myKey30.label = "\u0BCD" ;
        myKey30.showChakra = false ;
        myKey30.showCustomChakra = false ;
        myKey30.customChakraLayout = new String[] {} ;
        myKey30.showIcon = false ;
        myKey30.icon = "";
        myKey30.changeLayout = false ;
        myKey30.layout = "";
        myKey.set(30, myKey30);

        KeyAttr myKey31 = new KeyAttr();
        myKey31.code = 32;
        myKey31.label = "\u0BCC" ;
        myKey31.showChakra = false ;
        myKey31.showCustomChakra = false ;
        myKey31.customChakraLayout = new String[] {} ;
        myKey31.showIcon = false ;
        myKey31.icon = "";
        myKey31.changeLayout = false ;
        myKey31.layout = "";
        myKey.set(31, myKey31);

        KeyAttr myKey32 = new KeyAttr();
        myKey32.code = 33;
        myKey32.label = "\u0028" ;
        myKey32.showChakra = false ;
        myKey32.showCustomChakra = false ;
        myKey32.customChakraLayout = new String[] {} ;
        myKey32.showIcon = false ;
        myKey32.icon = "";
        myKey32.changeLayout = false ;
        myKey32.layout = "";
        myKey.set(32, myKey32);

        KeyAttr myKey33 = new KeyAttr();
        myKey33.code = 34;
        myKey33.label = "\u0029" ;
        myKey33.showChakra = false ;
        myKey33.showCustomChakra = false ;
        myKey33.customChakraLayout = new String[] {} ;
        myKey33.showIcon = false ;
        myKey33.icon = "";
        myKey33.changeLayout = false ;
        myKey33.layout = "";
        myKey.set(33, myKey33);

        KeyAttr myKey34 = new KeyAttr();
        myKey34.code = 35;
        myKey34.label = "\u0BD0" ;
        myKey34.showChakra = false ;
        myKey34.showCustomChakra = false ;
        myKey34.customChakraLayout = new String[] {} ;
        myKey34.showIcon = false ;
        myKey34.icon = "";
        myKey34.changeLayout = false ;
        myKey34.layout = "";
        myKey.set(34, myKey34);

        KeyAttr myKey35 = new KeyAttr();
        myKey35.code = 36;
        myKey35.label = "\u0B83" ;
        myKey35.showChakra = false ;
        myKey35.showCustomChakra = false ;
        myKey35.customChakraLayout = new String[] {} ;
        myKey35.showIcon = false ;
        myKey35.icon = "";
        myKey35.changeLayout = false ;
        myKey35.layout = "";
        myKey.set(35, myKey35);

        KeyAttr myKey36 = new KeyAttr();
        myKey36.code = 37;
        myKey36.label = "\u0B94" ;
        myKey36.showChakra = false ;
        myKey36.showCustomChakra = false ;
        myKey36.customChakraLayout = new String[] {} ;
        myKey36.showIcon = false ;
        myKey36.icon = "";
        myKey36.changeLayout = false ;
        myKey36.layout = "";
        myKey.set(36, myKey36);

        KeyAttr myKey37 = new KeyAttr();
        myKey37.code = 38;
        myKey37.label = "\u0BB6\u0BCD\u0BB0\u0BC0" ;
        myKey37.showChakra = false ;
        myKey37.showCustomChakra = false ;
        myKey37.customChakraLayout = new String[] {} ;
        myKey37.showIcon = false ;
        myKey37.icon = "";
        myKey37.changeLayout = false ;
        myKey37.layout = "";
        myKey.set(37, myKey37);

        KeyAttr myKey38 = new KeyAttr();
        myKey38.code = 39;
        myKey38.label = "\u003B" ;
        myKey38.showChakra = false ;
        myKey38.showCustomChakra = false ;
        myKey38.customChakraLayout = new String[] {} ;
        myKey38.showIcon = false ;
        myKey38.icon = "";
        myKey38.changeLayout = false ;
        myKey38.layout = "";
        myKey.set(38, myKey38);

        KeyAttr myKey39 = new KeyAttr();
        myKey39.code = 40;
        myKey39.label = "backspace" ;
        myKey39.showChakra = false ;
        myKey39.showCustomChakra = false ;
        myKey39.customChakraLayout = new String[] {} ;
        myKey39.showIcon = false ;
        myKey39.icon = "";
        myKey39.changeLayout = false ;
        myKey39.layout = "";
        myKey.set(39, myKey39);

        KeyAttr myKey40 = new KeyAttr();
        myKey40.code = 41;
        myKey40.label = "shift" ;
        myKey40.showChakra = false ;
        myKey40.showCustomChakra = false ;
        myKey40.customChakraLayout = new String[] {} ;
        myKey40.showIcon = false ;
        myKey40.icon = "";
        myKey40.changeLayout = false ;
        myKey40.layout = "";
        myKey.set(40, myKey40);

        KeyAttr myKey41 = new KeyAttr();
        myKey41.code = 42;
        myKey41.label = "eng/tam" ;
        myKey41.showChakra = false ;
        myKey41.showCustomChakra = false ;
        myKey41.customChakraLayout = new String[] {} ;
        myKey41.showIcon = false ;
        myKey41.icon = "";
        myKey41.changeLayout = false ;
        myKey41.layout = "";
        myKey.set(41, myKey41);

        KeyAttr myKey42 = new KeyAttr();
        myKey42.code = 43;
        myKey42.label = "space" ;
        myKey42.showChakra = false ;
        myKey42.showCustomChakra = false ;
        myKey42.customChakraLayout = new String[] {} ;
        myKey42.showIcon = false ;
        myKey42.icon = "";
        myKey42.changeLayout = false ;
        myKey42.layout = "";
        myKey.set(42, myKey42);

        KeyAttr myKey43 = new KeyAttr();
        myKey43.code = 44;
        myKey43.label = "enter" ;
        myKey43.showChakra = false ;
        myKey43.showCustomChakra = false ;
        myKey43.customChakraLayout = new String[] {} ;
        myKey43.showIcon = false ;
        myKey43.icon = "";
        myKey43.changeLayout = false ;
        myKey43.layout = "";
        myKey.set(43, myKey43);

        KeyAttr myKey44 = new KeyAttr();
        myKey44.code = 45;
        myKey44.label = "\u0032" ;
        myKey44.showChakra = false ;
        myKey44.showCustomChakra = false ;
        myKey44.customChakraLayout = new String[] {} ;
        myKey44.showIcon = false ;
        myKey44.icon = "";
        myKey44.changeLayout = false ;
        myKey44.layout = "";
        myKey.set(44, myKey44);

        KeyAttr myKey45 = new KeyAttr();
        myKey45.code = 46;
        myKey45.label = "\u0033" ;
        myKey45.showChakra = false ;
        myKey45.showCustomChakra = false ;
        myKey45.customChakraLayout = new String[] {} ;
        myKey45.showIcon = false ;
        myKey45.icon = "";
        myKey45.changeLayout = false ;
        myKey45.layout = "";
        myKey.set(45, myKey45);

        KeyAttr myKey46 = new KeyAttr();
        myKey46.code = 47;
        myKey46.label = "\u0BE7" ;
        myKey46.showChakra = false ;
        myKey46.showCustomChakra = false ;
        myKey46.customChakraLayout = new String[] {} ;
        myKey46.showIcon = false ;
        myKey46.icon = "";
        myKey46.changeLayout = false ;
        myKey46.layout = "";
        myKey.set(46, myKey46);

        KeyAttr myKey47 = new KeyAttr();
        myKey47.code = 48;
        myKey47.label = "\u0BE8" ;
        myKey47.showChakra = false ;
        myKey47.showCustomChakra = false ;
        myKey47.customChakraLayout = new String[] {} ;
        myKey47.showIcon = false ;
        myKey47.icon = "";
        myKey47.changeLayout = false ;
        myKey47.layout = "";
        myKey.set(47, myKey47);

        KeyAttr myKey48 = new KeyAttr();
        myKey48.code = 49;
        myKey48.label = "\u0BE9" ;
        myKey48.showChakra = false ;
        myKey48.showCustomChakra = false ;
        myKey48.customChakraLayout = new String[] {} ;
        myKey48.showIcon = false ;
        myKey48.icon = "";
        myKey48.changeLayout = false ;
        myKey48.layout = "";
        myKey.set(48, myKey48);

        KeyAttr myKey49 = new KeyAttr();
        myKey49.code = 50;
        myKey49.label = "\u0035" ;
        myKey49.showChakra = false ;
        myKey49.showCustomChakra = false ;
        myKey49.customChakraLayout = new String[] {} ;
        myKey49.showIcon = false ;
        myKey49.icon = "";
        myKey49.changeLayout = false ;
        myKey49.layout = "";
        myKey.set(49, myKey49);

        KeyAttr myKey50 = new KeyAttr();
        myKey50.code = 51;
        myKey50.label = "\u0036" ;
        myKey50.showChakra = false ;
        myKey50.showCustomChakra = false ;
        myKey50.customChakraLayout = new String[] {} ;
        myKey50.showIcon = false ;
        myKey50.icon = "";
        myKey50.changeLayout = false ;
        myKey50.layout = "";
        myKey.set(50, myKey50);

        KeyAttr myKey51 = new KeyAttr();
        myKey51.code = 52;
        myKey51.label = "\u0BEA" ;
        myKey51.showChakra = false ;
        myKey51.showCustomChakra = false ;
        myKey51.customChakraLayout = new String[] {} ;
        myKey51.showIcon = false ;
        myKey51.icon = "";
        myKey51.changeLayout = false ;
        myKey51.layout = "";
        myKey.set(51, myKey51);

        KeyAttr myKey52 = new KeyAttr();
        myKey52.code = 53;
        myKey52.label = "\u0BEB" ;
        myKey52.showChakra = false ;
        myKey52.showCustomChakra = false ;
        myKey52.customChakraLayout = new String[] {} ;
        myKey52.showIcon = false ;
        myKey52.icon = "";
        myKey52.changeLayout = false ;
        myKey52.layout = "";
        myKey.set(52, myKey52);

        KeyAttr myKey53 = new KeyAttr();
        myKey53.code = 54;
        myKey53.label = "\u0BEC" ;
        myKey53.showChakra = false ;
        myKey53.showCustomChakra = false ;
        myKey53.customChakraLayout = new String[] {} ;
        myKey53.showIcon = false ;
        myKey53.icon = "";
        myKey53.changeLayout = false ;
        myKey53.layout = "";
        myKey.set(53, myKey53);

        KeyAttr myKey54 = new KeyAttr();
        myKey54.code = 55;
        myKey54.label = "\u0038" ;
        myKey54.showChakra = false ;
        myKey54.showCustomChakra = false ;
        myKey54.customChakraLayout = new String[] {} ;
        myKey54.showIcon = false ;
        myKey54.icon = "";
        myKey54.changeLayout = false ;
        myKey54.layout = "";
        myKey.set(54, myKey54);

        KeyAttr myKey55 = new KeyAttr();
        myKey55.code = 56;
        myKey55.label = "\u0039" ;
        myKey55.showChakra = false ;
        myKey55.showCustomChakra = false ;
        myKey55.customChakraLayout = new String[] {} ;
        myKey55.showIcon = false ;
        myKey55.icon = "";
        myKey55.changeLayout = false ;
        myKey55.layout = "";
        myKey.set(55, myKey55);

        KeyAttr myKey56 = new KeyAttr();
        myKey56.code = 57;
        myKey56.label = "\u0BED" ;
        myKey56.showChakra = false ;
        myKey56.showCustomChakra = false ;
        myKey56.customChakraLayout = new String[] {} ;
        myKey56.showIcon = false ;
        myKey56.icon = "";
        myKey56.changeLayout = false ;
        myKey56.layout = "";
        myKey.set(56, myKey56);

        KeyAttr myKey57 = new KeyAttr();
        myKey57.code = 58;
        myKey57.label = "\u0BEE" ;
        myKey57.showChakra = false ;
        myKey57.showCustomChakra = false ;
        myKey57.customChakraLayout = new String[] {} ;
        myKey57.showIcon = false ;
        myKey57.icon = "";
        myKey57.changeLayout = false ;
        myKey57.layout = "";
        myKey.set(57, myKey57);

        KeyAttr myKey58 = new KeyAttr();
        myKey58.code = 59;
        myKey58.label = "\u0BEF" ;
        myKey58.showChakra = false ;
        myKey58.showCustomChakra = false ;
        myKey58.customChakraLayout = new String[] {} ;
        myKey58.showIcon = false ;
        myKey58.icon = "";
        myKey58.changeLayout = false ;
        myKey58.layout = "";
        myKey.set(58, myKey58);

        KeyAttr myKey59 = new KeyAttr();
        myKey59.code = 60;
        myKey59.label = "\u0030" ;
        myKey59.showChakra = false ;
        myKey59.showCustomChakra = false ;
        myKey59.customChakraLayout = new String[] {} ;
        myKey59.showIcon = false ;
        myKey59.icon = "";
        myKey59.changeLayout = false ;
        myKey59.layout = "";
        myKey.set(59, myKey59);

        KeyAttr myKey60 = new KeyAttr();
        myKey60.code = 61;
        myKey60.label = "\u0023" ;
        myKey60.showChakra = false ;
        myKey60.showCustomChakra = false ;
        myKey60.customChakraLayout = new String[] {} ;
        myKey60.showIcon = false ;
        myKey60.icon = "";
        myKey60.changeLayout = false ;
        myKey60.layout = "";
        myKey.set(60, myKey60);

        KeyAttr myKey61 = new KeyAttr();
        myKey61.code = 62;
        myKey61.label = "\u0028" ;
        myKey61.showChakra = false ;
        myKey61.showCustomChakra = false ;
        myKey61.customChakraLayout = new String[] {} ;
        myKey61.showIcon = false ;
        myKey61.icon = "";
        myKey61.changeLayout = false ;
        myKey61.layout = "";
        myKey.set(61, myKey61);

        KeyAttr myKey62 = new KeyAttr();
        myKey62.code = 63;
        myKey62.label = "\u0BE6" ;
        myKey62.showChakra = false ;
        myKey62.showCustomChakra = false ;
        myKey62.customChakraLayout = new String[] {} ;
        myKey62.showIcon = false ;
        myKey62.icon = "";
        myKey62.changeLayout = false ;
        myKey62.layout = "";
        myKey.set(62, myKey62);

        KeyAttr myKey63 = new KeyAttr();
        myKey63.code = 64;
        myKey63.label = "\u00D7" ; //D7
        myKey63.showChakra = false ;
        myKey63.showCustomChakra = false ;
        myKey63.customChakraLayout = new String[] {} ;
        myKey63.showIcon = false ;
        myKey63.icon = "";
        myKey63.changeLayout = false ;
        myKey63.layout = "";
        myKey.set(63, myKey63);

        KeyAttr myKey64 = new KeyAttr();
        myKey64.code = 65;
        myKey64.label = "\u0040" ;
        myKey64.showChakra = false ;
        myKey64.showCustomChakra = false ;
        myKey64.customChakraLayout = new String[] {} ;
        myKey64.showIcon = false ;
        myKey64.icon = "";
        myKey64.changeLayout = false ;
        myKey64.layout = "";
        myKey.set(64, myKey64);

        KeyAttr myKey65 = new KeyAttr();
        myKey65.code = 66;
        myKey65.label = "\u0025" ;
        myKey65.showChakra = false ;
        myKey65.showCustomChakra = false ;
        myKey65.customChakraLayout = new String[] {} ;
        myKey65.showIcon = false ;
        myKey65.icon = "";
        myKey65.changeLayout = false ;
        myKey65.layout = "";
        myKey.set(65, myKey65);

        KeyAttr myKey66 = new KeyAttr();
        myKey66.code = 67;
        myKey66.label = "\u0029" ;
        myKey66.showChakra = false ;
        myKey66.showCustomChakra = false ;
        myKey66.customChakraLayout = new String[] {} ;
        myKey66.showIcon = false ;
        myKey66.icon = "";
        myKey66.changeLayout = false ;
        myKey66.layout = "";
        myKey.set(66, myKey66);

        KeyAttr myKey67 = new KeyAttr();
        myKey67.code = 68;
        myKey67.label = "\u003A" ;
        myKey67.showChakra = false ;
        myKey67.showCustomChakra = false ;
        myKey67.customChakraLayout = new String[] {} ;
        myKey67.showIcon = false ;
        myKey67.icon = "";
        myKey67.changeLayout = false ;
        myKey67.layout = "";
        myKey.set(67, myKey67);

        KeyAttr myKey68 = new KeyAttr();
        myKey68.code = 69;
        myKey68.label = "\u002F" ;
        myKey68.showChakra = false ;
        myKey68.showCustomChakra = false ;
        myKey68.customChakraLayout = new String[] {} ;
        myKey68.showIcon = false ;
        myKey68.icon = "";
        myKey68.changeLayout = false ;
        myKey68.layout = "";
        myKey.set(68, myKey68);

        KeyAttr myKey69 = new KeyAttr();
        myKey69.code = 70;
        myKey69.label = "\u20B9" ;
        myKey69.showChakra = true ;
        myKey69.showCustomChakra = true ;
        myKey69.customChakraLayout = new String[] {"\u0024","\u00A3","\u20AC","\u0BF9","\u20A3","\u20a8","\u00A5","\u00A2","",""} ;
        myKey69.showIcon = false ;
        myKey69.icon = "";
        myKey69.changeLayout = false ;
        myKey69.layout = "";
        myKey.set(69, myKey69);

        KeyAttr myKey70 = new KeyAttr();
        myKey70.code = 71;
        myKey70.label = "\u007E" ;
        myKey70.showChakra = true ;
        myKey70.showCustomChakra = true ;
        myKey70.customChakraLayout = new String[] {"\u007E","\u3003","\u005E","\u003C","\u003E","\u0060","\\","{","}",""} ;
        myKey70.showIcon = false ;
        myKey70.icon = "";
        myKey70.changeLayout = false ;
        myKey70.layout = "";
        myKey.set(70, myKey70);

        KeyAttr myKey71 = new KeyAttr();
        myKey71.code = 72;
        myKey71.label = "\u0026" ;
        myKey71.showChakra = true ;
        myKey71.showCustomChakra = true ;
        myKey71.customChakraLayout = new String[] {"\u2022","\u00B0","\u00B6","\u00A7","\u2120","\u2122","\u00AE","\u00A9","",""} ;
        myKey71.showIcon = false ;
        myKey71.icon = "";
        myKey71.changeLayout = false ;
        myKey71.layout = "";
        myKey.set(71, myKey71);

        KeyAttr myKey72 = new KeyAttr();
        myKey72.code = 73;
        myKey72.label = "\u002C" ;
        myKey72.showChakra = false ;
        myKey72.showCustomChakra = false ;
        myKey72.customChakraLayout = new String[] {} ;
        myKey72.showIcon = false ;
        myKey72.icon = "";
        myKey72.changeLayout = false ;
        myKey72.layout = "";
        myKey.set(72, myKey72);

        KeyAttr myKey73 = new KeyAttr();
        myKey73.code = 74;
        myKey73.label = "\u002E" ;
        myKey73.showChakra = false ;
        myKey73.showCustomChakra = false ;
        myKey73.customChakraLayout = new String[] {} ;
        myKey73.showIcon = false ;
        myKey73.icon = "";
        myKey73.changeLayout = false ;
        myKey73.layout = "";
        myKey.set(73, myKey73);

        KeyAttr myKey74 = new KeyAttr();
        myKey74.code = 75;
        myKey74.label = "\u0031" ;
        myKey74.showChakra = false ;
        myKey74.showCustomChakra = false ;
        myKey74.customChakraLayout = new String[] {} ;
        myKey74.showIcon = false ;
        myKey74.icon = "";
        myKey74.changeLayout = false ;
        myKey74.layout = "";
        myKey.set(74, myKey74);

        KeyAttr myKey75 = new KeyAttr();
        myKey75.code = 76;
        myKey75.label = "\u0034" ;
        myKey75.showChakra = false ;
        myKey75.showCustomChakra = false ;
        myKey75.customChakraLayout = new String[] {} ;
        myKey75.showIcon = false ;
        myKey75.icon = "";
        myKey75.changeLayout = false ;
        myKey75.layout = "";
        myKey.set(75, myKey75);

        KeyAttr myKey76 = new KeyAttr();
        myKey76.code = 77;
        myKey76.label = "\u0037" ;
        myKey76.showChakra = false ;
        myKey76.showCustomChakra = false ;
        myKey76.customChakraLayout = new String[] {} ;
        myKey76.showIcon = false ;
        myKey76.icon = "";
        myKey76.changeLayout = false ;
        myKey76.layout = "";
        myKey.set(76, myKey76);

        KeyAttr myKey77 = new KeyAttr();
        myKey77.code = 78;
        myKey77.label = "\u002a" ;
        myKey77.showChakra = false ;
        myKey77.showCustomChakra = false ;
        myKey77.customChakraLayout = new String[] {} ;
        myKey77.showIcon = false ;
        myKey77.icon = "";
        myKey77.changeLayout = false ;
        myKey77.layout = "";
        myKey.set(77, myKey77);

        KeyAttr myKey78 = new KeyAttr();
        myKey78.code = 79;
        myKey78.label = "\u002d" ;
        myKey78.showChakra = false ;
        myKey78.showCustomChakra = false ;
        myKey78.customChakraLayout = new String[] {} ;
        myKey78.showIcon = false ;
        myKey78.icon = "";
        myKey78.changeLayout = false ;
        myKey78.layout = "";
        myKey.set(78, myKey78);

        KeyAttr myKey79 = new KeyAttr();
        myKey79.code = 80;
        myKey79.label = "\u002B" ;
        myKey79.showChakra = false ;
        myKey79.showCustomChakra = false ;
        myKey79.customChakraLayout = new String[] {} ;
        myKey79.showIcon = false ;
        myKey79.icon = "";
        myKey79.changeLayout = false ;
        myKey79.layout = "";
        myKey.set(79, myKey79);

        KeyAttr myKey80 = new KeyAttr();
        myKey80.code = 81;
        myKey80.label = "\u2212" ;
        myKey80.showChakra = false ;
        myKey80.showCustomChakra = false ;
        myKey80.customChakraLayout = new String[] {} ;
        myKey80.showIcon = false ;
        myKey80.icon = "";
        myKey80.changeLayout = false ;
        myKey80.layout = "";
        myKey.set(80, myKey80);

        KeyAttr myKey81 = new KeyAttr();
        myKey81.code = 82;
        myKey81.label = "\u003D" ;
        myKey81.showChakra = false ;
        myKey81.showCustomChakra = false ;
        myKey81.customChakraLayout = new String[] {} ;
        myKey81.showIcon = false ;
        myKey81.icon = "";
        myKey81.changeLayout = false ;
        myKey81.layout = "";
        myKey.set(81, myKey81);

        KeyAttr myKey82 = new KeyAttr();
        myKey82.code = 83;
        myKey82.label = "\u003B" ;
        myKey82.showChakra = false ;
        myKey82.showCustomChakra = false ;
        myKey82.customChakraLayout = new String[] {} ;
        myKey82.showIcon = false ;
        myKey82.icon = "";
        myKey82.changeLayout = false ;
        myKey82.layout = "";
        myKey.set(82, myKey82);

        KeyAttr myKey83 = new KeyAttr();
        myKey83.code = 84;
        myKey83.label = "backspace" ;
        myKey83.showChakra = false ;
        myKey83.showCustomChakra = false ;
        myKey83.customChakraLayout = new String[] {} ;
        myKey83.showIcon = false ;
        myKey83.icon = "";
        myKey83.changeLayout = false ;
        myKey83.layout = "";
        myKey.set(83, myKey83);

        KeyAttr myKey84 = new KeyAttr();
        myKey84.code = 85;
        myKey84.label = "shift" ;
        myKey84.showChakra = false ;
        myKey84.showCustomChakra = false ;
        myKey84.customChakraLayout = new String[] {} ;
        myKey84.showIcon = false ;
        myKey84.icon = "";
        myKey84.changeLayout = false ;
        myKey84.layout = "";
        myKey.set(84, myKey84);

        KeyAttr myKey85 = new KeyAttr();
        myKey85.code = 86;
        myKey85.label = "eng" ;
        myKey85.showChakra = false ;
        myKey85.showCustomChakra = false ;
        myKey85.customChakraLayout = new String[] {} ;
        myKey85.showIcon = false ;
        myKey85.icon = "";
        myKey85.changeLayout = false ;
        myKey85.layout = "";
        myKey.set(85, myKey85);

        KeyAttr myKey86 = new KeyAttr();
        myKey86.code = 87;
        myKey86.label = "space" ;
        myKey86.showChakra = false ;
        myKey86.showCustomChakra = false ;
        myKey86.customChakraLayout = new String[] {} ;
        myKey86.showIcon = false ;
        myKey86.icon = "";
        myKey86.changeLayout = false ;
        myKey86.layout = "";
        myKey.set(86, myKey86);

        KeyAttr myKey87 = new KeyAttr();
        myKey87.code = 88;
        myKey87.label = "enter" ;
        myKey87.showChakra = false ;
        myKey87.showCustomChakra = false ;
        myKey87.customChakraLayout = new String[] {} ;
        myKey87.showIcon = false ;
        myKey87.icon = "";
        myKey87.changeLayout = false ;
        myKey87.layout = "";
        myKey.set(87, myKey87);




    }

    @Override @SuppressLint("UseSparseArrays")
    public HashMap<Integer, KeyAttr> hashThis() {
        HashMap<Integer, KeyAttr> hashed = new HashMap<Integer, KeyAttr>();
        for (int i=0; i<nKeys; i++) {
            KeyAttr key = myKey.get(i);
            hashed.put(key.code, key);
        }
        return hashed;
    }
}