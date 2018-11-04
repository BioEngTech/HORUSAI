package horusai.masterapp.initiation;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import horusai.masterapp.R;
import horusai.masterapp.initiation.Login;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

/**
 * Created by joaosousa on 04/11/18.
 */

public class LoginTest {

    Login loginActivity;
    Context loginContext;

    @Before
    public void setUp() {
        Login loginActivity = mock(Login.class);
        loginContext = loginActivity.getBaseContext();
    }

    @Test
    public void spinVisibility_testViewGONE() {

        View viewMock = mock(View.class);

        Button buttonMock = mock(Button.class);

        Login.spinvisibility(viewMock, View.GONE, buttonMock, loginContext);

        verifyZeroInteractions(viewMock, buttonMock);
    }
}
