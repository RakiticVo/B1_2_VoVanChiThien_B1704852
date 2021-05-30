package com.chithien.vvct.b1_2_vovanchithien_b1704852;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnMenu, btnPopup, btnExit;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khai báo
        btnMenu = (Button)findViewById(R.id.btnMenu);
        btnPopup = (Button)findViewById(R.id.btnPopup);
        btnExit = (Button)findViewById(R.id.btnExit);

        // Xử lý sự kiện các View

        // BtnExit
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        btnMenu.setOnCreateContextMenuListener(this);

        // Btn Popup
        btnPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu();
            }
        });

    }

    //Tạo Option Menu
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_tuychon, menu);
        return true;
    }

    // Xử lý click các item
    public boolean onOptionsItemSelected(MenuItem item){
        // Tải ImageView đã khai báo trong Layout để đặt hình vào.
        ImageView img = (ImageView)findViewById(R.id.img);
        // Xử lý từng item
        switch (item.getItemId()){
            // Đặt lại ảnh mới
            case R.id.item1:
                img.setImageResource(R.drawable.chimp);
                return true;
            case R.id.item2:
                img.setImageResource(R.drawable.crowned_crane);
                return true;
            case R.id.item3:
                img.setImageResource(R.drawable.dolphin);
                return true;
            case R.id.item4:
                img.setImageResource(R.drawable.drake);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    // Tạo Context Menu
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_ngucanh, menu);
    }

    // Xử lý click các item
    public boolean onContextItemSelected(MenuItem item){
        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        // Xử lý từng item
        switch (item.getItemId()){
            case R.id.item1:
                // Khai báo 1 Toast
                Toast toast = new Toast(this); // Tạo 1 đối tượng Toast
                toast.setGravity(Gravity.CENTER, 100, 100); // Đặt vị trí cho Toast

                // Tạo ra 1 Text view
                TextView txt = new TextView(this); // Tạo 1 đối tượng hiển thị text
                txt.setBackgroundColor(Color.BLUE); // Setting màu nền
                txt.setTextColor(Color.WHITE); // Setting màu chữ
                txt.setTextSize(25); // Setting size chữ
                Typeface typeface = Typeface.create("serif", Typeface.BOLD);
                txt.setTypeface(typeface);
                txt.setPadding(10,10,10,10);
                txt.setText("Bộ phận tiếp thị; \n Bộ phận nhập hàng; \n Bộ phận giao hàng; \n Bộ phận kế toán;");

                // Setting Toast
                toast.setView(txt); // Setting text cho Toast
                toast.setDuration(Toast.LENGTH_LONG); // Setting thời gian hiển thị
                toast.show();
                return true;

            case R.id.item2_1:
                // Khai báo 1 Toast
                Toast toast1 = new Toast(this); // Tạo 1 đối tượng Toast
                toast1.setGravity(Gravity.CENTER, 100, 100); // Đặt vị trí cho Toast

                // Tạo ra 1 Text view
                TextView txt1 = new TextView(this); // Tạo 1 đối tượng hiển thị text
                txt1.setBackgroundColor(Color.BLACK); // Setting màu nền
                txt1.setTextColor(Color.YELLOW); // Setting màu chữ
                txt1.setTextSize(25); // Setting size chữ
                Typeface typeface1 = Typeface.create("serif", Typeface.BOLD);
                txt1.setTypeface(typeface1);
                txt1.setPadding(10,10,10,10);
                txt1.setText("1. Trần Ngọc Thơ;\n 2. Nguyễn Văn Toàn;\n 3. Lê Thị Hoa;");

                // Setting Toast
                toast1.setView(txt1); // Setting text cho Toast
                toast1.setDuration(Toast.LENGTH_LONG); // Setting thời gian hiển thị
                toast1.show();
                return true;

            case R.id.item2_2:
                // Khai báo 1 Toast
                Toast toast2 = new Toast(this); // Tạo 1 đối tượng Toast
                toast2.setGravity(Gravity.CENTER, 100, 100); // Đặt vị trí cho Toast

                // Tạo ra 1 Text view
                TextView txt2 = new TextView(this); // Tạo 1 đối tượng hiển thị text
                txt2.setBackgroundColor(Color.GREEN); // Setting màu nền
                txt2.setTextColor(Color.CYAN); // Setting màu chữ
                txt2.setTextSize(25); // Setting size chữ
                Typeface typeface2 = Typeface.create("serif", Typeface.BOLD);
                txt2.setTypeface(typeface2);
                txt2.setPadding(10,10,10,10);
                txt2.setText("1. Nguyễn văn A; \n 2. Lâm Văn Mới;");

                // Setting Toast
                toast2.setView(txt2); // Setting text cho Toast
                toast2.setDuration(Toast.LENGTH_LONG); // Setting thời gian hiển thị
                toast2.show();
                return true;

            case R.id.item2_3:
                // Khai báo 1 Toast
                Toast toast3 = new Toast(this); // Tạo 1 đối tượng Toast
                toast3.setGravity(Gravity.CENTER, 100, 100); // Đặt vị trí cho Toast

                // Tạo ra 1 Text view
                TextView txt3 = new TextView(this); // Tạo 1 đối tượng hiển thị text
                txt3.setBackgroundColor(Color.MAGENTA); // Setting màu nền
                txt3.setTextColor(Color.GRAY); // Setting màu chữ
                txt3.setTextSize(25); // Setting size chữ
                Typeface typeface3 = Typeface.create("serif", Typeface.BOLD);
                txt3.setTypeface(typeface3);
                txt3.setPadding(10,10,10,10);
                txt3.setText("1. Trần Văn Bảy; \n 2. Nguyễn Văn Tâm; \n 3. Châu Thành Quí;");

                // Setting Toast
                toast3.setView(txt3); // Setting text cho Toast
                toast3.setDuration(Toast.LENGTH_LONG); // Setting thời gian hiển thị
                toast3.show();
                return true;

            case R.id.item2_4:
                // Khai báo 1 Toast
                Toast toast4 = new Toast(this); // Tạo 1 đối tượng Toast
                toast4.setGravity(Gravity.CENTER, 100, 100); // Đặt vị trí cho Toast

                // Tạo ra 1 Text view
                TextView txt4 = new TextView(this); // Tạo 1 đối tượng hiển thị text
                txt4.setBackgroundColor(Color.RED); // Setting màu nền
                txt4.setTextColor(Color.DKGRAY); // Setting màu chữ
                txt4.setTextSize(25); // Setting size chữ
                Typeface typeface4 = Typeface.create("serif", Typeface.BOLD);
                txt4.setTypeface(typeface4);
                txt4.setPadding(10,10,10,10);
                txt4.setText("1. Lê Thị Lý; \n Trần Ngọc Mai.");

                // Setting Toast
                toast4.setView(txt4); // Setting text cho Toast
                toast4.setDuration(Toast.LENGTH_LONG); // Setting thời gian hiển thị
                toast4.show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    // Tạo Popup Menu
    private void showPopupMenu(){
        // Tạo 1 đối tượng Popup Menu.
        PopupMenu popupMenu = new PopupMenu(this, btnPopup);

        //Lấy giao diện menu trong resoucse.
        popupMenu.getMenuInflater().inflate(R.menu.menu_popup,popupMenu.getMenu());

        //Xử lý sự kiện khi các item được chọn.
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item3_1: btnPopup.setText("MENU COPY");
                        break;
                }
                switch (item.getItemId()) {
                    case R.id.item3_2: btnPopup.setText("MENU PAST");
                        break;
                }
                switch (item.getItemId()) {
                    case R.id.item3_3: btnPopup.setText("MENU SAVE");
                        break;
                }
                switch (item.getItemId()) {
                    case R.id.item3_4: btnPopup.setText("MENU DELETE");
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }
}