package com.example.javacode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    Button btnHello = new Button();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        //4. 리니어 레이아웃의 형태 및 크기를 정의해줘야 하기 때문에 LayoutParams 생성 (weight/height 값을 정의 = 높이와 넓이를 전부 부모공간을 차지한다.)
        LinearLayout.LayoutParams btnparams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        //10. 버튼크기를 조절위해 생성

       //setContentView(R.layout.activity_main);   엑티비티 메인 xml을 삭제하였다.
        LinearLayout layout = new LinearLayout(this);
        //1.리니어 레이아웃을 하나 생성해야한다 - >버튼은 레이아웃 기능이 없기 때문
        layout.setOrientation(LinearLayout.VERTICAL);
        //2. 리니어 레이아웃을  VERTICAL 했다.(xml이 없기 때문에 다 제작해야됨)
        setContentView(layout,params);
        //3.내가 만든 레이아웃을 세팅하겠다.(xml이 없기 때문에 자바에서 만든 것을 정의함->크기를 알 수 없다 (다음))
        //5. ,params  크기를 params 만큼 세팅할 것이다.
        Button btnHello = new Button(this);
        //0. 버튼을 생성하고 선언했다.
        //9.버튼의 크기를 정하지 않으면 weight 는 MATCH_PARENT height 는 wrap_content
        btnHello.setText("버튼입니다.");
        //6.버튼의 텍스트 생성
        layout.addView(btnHello,btnparams);
        //7..addView  레이아웃 안에 추가하겠다 (btnhello버튼을)

        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"안녕하세요.여러분",Toast.LENGTH_SHORT).show();
                //8. 버튼이 동작하게 하기 위해 btnhello에 setOnClickListener(new View.OnClickListener() 생성하여, Toast 제작했다.
            }
        });
    }
}
