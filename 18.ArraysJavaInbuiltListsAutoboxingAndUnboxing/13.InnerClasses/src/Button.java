public class Button {
    //Create the fields
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    //Create an OnClickListener Setter
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
    //Create an onClick method
    public void onClick() {
        this.onClickListener.onClick(this.title);
    }
    //Create the OnClickListener interface
    public interface OnClickListener {
        public void onClick(String title);
    }
}
