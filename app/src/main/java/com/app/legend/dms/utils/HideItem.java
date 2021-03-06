package com.app.legend.dms.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HideItem extends RelativeLayout {

    private ImageView book;
    private TextView title;
    private TextView author;
    private Context context;
    private TextView del;
    private LinearLayout linearLayout;

    public HideItem(Context context) {
        super(context);
        init(context);
    }

    public HideItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public HideItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public HideItem(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }


    /*初始化控件*/
    private void init(Context context){

        book=new ImageView(context);
        title=new TextView(context);
        author=new TextView(context);
        del=new TextView(context);
        this.context=context;
        linearLayout=new LinearLayout(context);

        title.setTextSize(18);
        author.setTextSize(16);
        del.setTextSize(16);

        title.setMaxLines(1);
        title.setEllipsize(TextUtils.TruncateAt.END);

        author.setMaxLines(1);
        author.setEllipsize(TextUtils.TruncateAt.END);

        del.setTextColor(Color.RED);
        del.setMaxLines(1);
        del.setEllipsize(TextUtils.TruncateAt.END);
        del.setText("已下架");
        del.setVisibility(GONE);

        linearLayout.setOrientation(LinearLayout.VERTICAL);//垂直布局

//        book.setScaleType(ImageView.ScaleType.CENTER_CROP);

        addView(book);

        addView(linearLayout);

        linearLayout.addView(title);
        linearLayout.addView(author);
        linearLayout.addView(del);

//        addView(title);
//        addView(author);
//        addView(del);

    }

    /*重绘高度*/
    private void reDraw(){

        int height= (int) getDip(120,context);//高度取120dp
        int width=context.getResources().getDisplayMetrics().widthPixels;//宽度取屏幕的宽

        ViewGroup.LayoutParams params=getLayoutParams();

        params.height=height;
        params.width=width;

        setLayoutParams(params);

        /**
         * 设置图片
         */

        int book_height= (int) getDip(120,context);

        int margin= (int) getDip(6,context);
        int book_width= (int) getDip(100,context);

        RelativeLayout.LayoutParams bookParams=
                new RelativeLayout.LayoutParams(book_width, book_height);
        bookParams.setMargins(margin,margin,0,margin);

        book.setLayoutParams(bookParams);

        //设置线性布局

        RelativeLayout.LayoutParams ll= (LayoutParams) linearLayout.getLayoutParams();

        ll.height=height;
        ll.width=width;

        ll.setMargins(book_width,0,0,0);

        linearLayout.setLayoutParams(ll);

        int padding= (int) getDip(16,context);
        int half=padding/2;

        linearLayout.setPadding(padding,half,0,0);


//        int book_width= (int) getDip(100,context);

//
//        RelativeLayout.LayoutParams textParams=
//                new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        int margin2= (int) getDip(16,context);
//
//        textParams.setMargins(margin2,margin2,0,0);
//
//        title.setLayoutParams(textParams);
//
//        RelativeLayout.LayoutParams textParams2=
//                new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//
//        textParams2.setMargins(margin2,margin2,0,0);
//
//        author.setLayoutParams(textParams2);
//
//        RelativeLayout.LayoutParams layoutParams=
//                new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//
//        int margin3=margin2+margin;
//
//        layoutParams.setMargins(margin2,margin2,0,0);
//
//        del.setLayoutParams(layoutParams);//设置第三行
//
//        del.setText("已下架");
//
//        book.setVisibility(INVISIBLE);

    }

    private float getDip(int d, Context activity){

        return TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, d,
                activity.getResources().getDisplayMetrics());

    }

    @Override
    public void requestLayout() {
        super.requestLayout();
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);


        int book_l= (int) getDip(8,context);
        int book_r=book_l+book.getMeasuredWidth();
        int book_b=book_l+book.getMeasuredHeight();
        book.layout(book_l,book_l,book_r,book_b);
//
//        /**/
//
//        int margin1= (int) getDip(16,context);
//
//        int text1_l=book_r+margin1;
//        int text1_r=context.getResources().getDisplayMetrics().widthPixels;
//        int text1_t=margin1;
//        int text1_b=title.getMeasuredHeight()+margin1;
//
//        title.layout(text1_l,text1_t,text1_r,text1_b);
//
//        int margin2= (int) getDip(8,context);
//
//        /**/
//
//        int text2_l=book_r+margin1;
//        int text2_r=context.getResources().getDisplayMetrics().widthPixels;
//        int text2_t=title.getMeasuredHeight()+margin2+margin2;
//        int text2_b=text2_t+author.getMeasuredHeight();
//
//        author.layout(text2_l,text2_t,text2_r,text2_b);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        reDraw();
    }

    public ImageView getBook() {
        return book;
    }

    public void setBook(ImageView book) {
        this.book = book;
    }

    public TextView getTitle() {
        return title;
    }

    public void setTitle(TextView title) {
        this.title = title;
    }

    public TextView getAuthor() {
        return author;
    }

    public void setAuthor(TextView author) {
        this.author = author;
    }


    public TextView getDel() {
        return del;
    }

    public void setDel(TextView del) {
        this.del = del;
    }

    private float getSp(int d, Context activity){

        return TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP, d,
                activity.getResources().getDisplayMetrics());

    }

}
