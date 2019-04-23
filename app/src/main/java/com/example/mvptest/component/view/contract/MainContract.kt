package com.example.mvptest.component.view.contract

import com.example.mvptest.base.BasePresenter
import com.example.mvptest.base.BaseView

interface MainContract{

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

    interface View : BaseView<Presenter>{

    }

    interface Presenter : BasePresenter{
        // view -> 데이터 요청 받음
        // model <- 데이터 받음
        // view <- 데이터 보냄


    }
}