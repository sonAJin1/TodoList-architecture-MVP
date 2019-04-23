package com.example.mvptest.component.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvptest.R
import com.example.mvptest.base.BaseView

class MainActivity : AppCompatActivity() {
    /**
     *
     * 필요한 기능 :
     *
     *  1. 버튼 클릭해서 할일 작성할 수 있는 화면으로 넘어가기
     *  2. 할일 추가하면 리스트에 추가
     *  3. Delete
     *  4. All clean
     *  5. 비활성화 (할일 완료)
     *
     * */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}
