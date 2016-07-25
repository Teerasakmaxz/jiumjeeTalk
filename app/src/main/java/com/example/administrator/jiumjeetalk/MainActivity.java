package com.example.administrator.jiumjeetalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tex;
    Button btn1,btn2;
    ImageView img;
    int x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        tex=(TextView)findViewById(R.id.textView);
        img=(ImageView)findViewById(R.id.img);
        x=0;
    }
    public void ans1(View v){
        x=x+1;

        change(x);

    }
    public void  ans2(View v){
        x=x*10;
        change(x);

    }
    public void change(int x) {

        switch (x) {

            case 1:
                tex.setText("ทำไรอยู่จ๊ะ");
                btn1.setText("นั่งเล่น");
                btn2.setText("คุยกับเธอไง");
                img.setImageResource(R.drawable.e);

                break;

            case 2:
                tex.setText("กินข้าวยัง");
                btn1.setText("อิ่มแล้วจุ๊บๆ ");
                btn2.setText("ยังไม่กิน รอกินพร้อมตัวเองอ่ะ");
                img.setImageResource(R.drawable.e);

                break;
            case 3:
                tex.setText("ปากหวานนะตัวเอง");
                btn1.setText("อยากชิมปะหล่ะ ");
                btn2.setText("หวานเหมือนน้ำตาลเลยละ ");
                img.setImageResource(R.drawable.a);

                break;
            case 4:
                tex.setText("มาสิอยากลองจังเลย");
                btn1.setText("ตัวเองหื่นอ่ะ ");
                btn2.setText("อุ๊ย ไอบ้ากาม");
                img.setImageResource(R.drawable.b);

                break;
            case 5:
                tex.setText("ไม่หื่นนะแค่น้ำลายไหล อิอิ");
                btn1.setText("อี๋  ");
                btn2.setText("ไม่ได้เห็นขาอ่อนหรอก");
                img.setImageResource(R.drawable.e);

                break;
            case 6:
                tex.setText("เชอะสนไหน");
                btn1.setText("ไม่สนจริงอ่ะ ");
                btn2.setText("ทำเป็นหยิ่ง");
                img.setImageResource(R.drawable.d);

                break;
            case 7:
                tex.setText("ง้อดีกว่า");
                btn1.setText("ไม่ให้ง้อหรอก ");
                btn2.setText("มาดิ  มาดิ");
                img.setImageResource(R.drawable.f);

                break;

            case 8:
                tex.setText("หายงอลยัง");
                btn1.setText("ใกล้หายแล้ว ");
                btn2.setText("หึ  หึ   หึ");
                img.setImageResource(R.drawable.g);

                break;

            case 9:
                tex.setText("งอลมากเดี๋ยวจับจูบซะเลย");
                btn1.setText("บ้าหรอ  เค้าเขินนะ ");
                btn2.setText("ยากนะจ๊ะ");
                img.setImageResource(R.drawable.h);

                break;

            case 10:
                tex.setText("แบบนี้ต้องจัด………");
                btn1.setText("จัดอะไร ");
                btn2.setText("จะบ้าหรอ");
                img.setImageResource(R.drawable.i);

                break;

            case 11:
                tex.setText("แบบนี้รักตายเลย");
                btn1.setText("จริงป่ะ ");
                btn2.setText("โม้หรือเปล่า");
                img.setImageResource(R.drawable.i);

                break;



        }
    }

}