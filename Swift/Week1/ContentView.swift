//
//  ContentView.swift
//  1_Sandwich
//
//  Created by 김원희 on 2022/04/02.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        NavigationView {
            List {
                Text("Toast")
                    .font(.title)
                
                Toggle(isOn: /*@PLACEHOLDER=Is On@*/.constant(true)) {
                    Text("핫소스 추가")
                }
                Toggle(isOn: /*@PLACEHOLDER=Is On@*/.constant(true)) {
                    Text("아보카도 추가")
                }
                Stepper(value: .constant(4)/*@END_MENU_TOKEN@*/, in: /*@START_MENU_TOKEN@*//*@PLACEHOLDER=Range@*/1...10) {
                    Text("수량")
                }
                NavigationLink(destination: OrderView()) {
                    Text("주문하기")
                }
            }
           
        }
    }
}


struct OrderView: View {
    var body: some View {
        Text("주문완료")
    }
}



struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

struct OrderView_Previews: PreviewProvider {
    static var previews: some View {
        OrderView()
    }
}
