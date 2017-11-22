package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice02Rotation extends RelativeLayout {
    Button animateBt;
    ImageView imageView;
    private int state = 1;
    private static final int STATE_X = 3;
    private static final int STATE_X_NEGATIVE = 4;
    private static final int STATE_Y = 5;
    private static final int STATE_Y_NEGATIVE = 6;
    private static final int STATE_Z = 1;
    private static final int STATE_Z_NEGATIVE = 2;

    public Practice02Rotation(Context context) {
        super(context);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                switch (state) {
                    case STATE_Z:
                        imageView.animate().rotation(180);
                        break;
                    case STATE_Z_NEGATIVE:
                        imageView.animate().rotation(0);
                        break;
                    case STATE_X:
                        imageView.animate().rotationX(180);
                        break;
                    case STATE_X_NEGATIVE:
                        imageView.animate().rotationX(0);
                        break;
                    case STATE_Y:
                        imageView.animate().rotationY(180);
                        break;
                    case STATE_Y_NEGATIVE:
                        imageView.animate().rotationY(0);
                    default:
                        break;
                }
                state++;
                if(state > 6) {
                    state = 1;
                }
            }
        });
    }
}