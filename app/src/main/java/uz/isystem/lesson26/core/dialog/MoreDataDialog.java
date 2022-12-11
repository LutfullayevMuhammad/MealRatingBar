package uz.isystem.lesson26.core.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import uz.isystem.lesson26.R;

public class MoreDataDialog extends BottomSheetDialog {

    View view;

    private final String title;
    private final String desc;

    private TextView titleView, descView;

    public MoreDataDialog(@NonNull Context context, String title, String desc) {
        super(context);
        this.title = title;
        this.desc = desc;
        setup(context);
    }

    private void setup(Context context) {

        view = LayoutInflater.from(context).inflate(R.layout.more_dialog, null, false);

        titleView = view.findViewById(R.id.title_dialog);
        descView = view.findViewById(R.id.desc_dialog);

        titleView.setText(title);
        descView.setText(desc);

        setContentView(view);
    }
}
