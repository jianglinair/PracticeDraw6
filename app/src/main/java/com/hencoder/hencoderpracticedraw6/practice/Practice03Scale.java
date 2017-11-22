package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice03Scale extends RelativeLayout {
    Button animateBt;
    ImageView imageView;
    private int state = 1;
    private static final int STATE_X = 1;
    private static final int STATE_X_NEGATIVE = 2;
    private static final int STATE_Y = 3;
    private static final int STATE_Y_NEGATIVE = 4;

    public Practice03Scale(Context context) {
        super(context);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                switch (state) {
                    case STATE_X:
                        imageView.animate().scaleX(1.5f);
                        break;
                    case STATE_X_NEGATIVE:
                        imageView.animate().scaleX(1);
                        break;
                    case STATE_Y:
                        imageView.animate().scaleY(0.5f);
                        break;
                    case STATE_Y_NEGATIVE:
                        imageView.animate().scaleY(1);
                    default:
                        break;
                }
                state++;
                if(state > 4) {
                    state = 1;
                }
            }
        });
    }
}
