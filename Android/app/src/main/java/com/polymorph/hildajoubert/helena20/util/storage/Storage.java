package com.polymorph.hildajoubert.helena20.util.storage;

import android.support.annotation.NonNull;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;

import rx.Observable;

public interface Storage {

    Observable<AuthResult> signInWithEmailAndPassword(@NonNull final String email,
                                                      @NonNull final String password);

    Observable<FirebaseUser> observeAuthState();
}
