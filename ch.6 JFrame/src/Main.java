import javax.swing.*;

public class Main {
    public static void main(String []args)
    {
        JFrame frame = new JFrame();
        //타이틀 생성
        frame.setTitle("Title");
        //사이즈 정하기
        frame.setSize(350,350);
        //화면을 가운데료
        frame.setLocationRelativeTo(null);
        //껏을때 메모리 해제
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //레이아웃 설정
        frame.getContentPane().setLayout(null);
        //버튼 추가
        JButton btn1 = new JButton("버튼 1");
        JButton btn2 = new JButton("버튼 2");
        //버튼 위치잡기
        btn1.setBounds(30, 170, 122, 30);
        btn2.setBounds(182, 170, 122, 30);
        //레이아웃 설정
        frame.getContentPane().add(btn1);
        frame.getContentPane().add(btn2);
        //라벨 추가
        JLabel lbl = new JLabel();
        lbl.setBounds(30, 200, 274, 50);
        lbl.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
        frame.getContentPane().add(lbl);
        //버튼 액션 추가
        btn1.addActionListener(event-> lbl.setText("버튼 1"));
        btn2.addActionListener(event-> lbl.setText("버튼 2"));
        //화면 출력
        frame.setVisible(true);

    }
}
