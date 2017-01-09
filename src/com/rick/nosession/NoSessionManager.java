package com.rick.nosession;

import java.io.IOException;

import org.apache.catalina.Lifecycle;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.LifecycleState;
import org.apache.catalina.Session;
import org.apache.catalina.session.ManagerBase;
import org.apache.catalina.util.LifecycleSupport;

/**
 * @Author Rick on 2017/1/9
 */
public class NoSessionManager extends ManagerBase implements Lifecycle {
    protected LifecycleSupport lifecycle = new LifecycleSupport(this);

    @Override
    public void addLifecycleListener(LifecycleListener listener) {
        lifecycle.addLifecycleListener(listener);
    }

    @Override
    public LifecycleListener[] findLifecycleListeners() {
        return lifecycle.findLifecycleListeners();
    }

    @Override
    public void removeLifecycleListener(LifecycleListener listener) {
        lifecycle.removeLifecycleListener(listener);
    }

    @Override
    protected synchronized void startInternal() throws LifecycleException {
        super.startInternal();
        setState(LifecycleState.STARTING);
        setDistributable(true);
    }

    @Override
    protected synchronized void stopInternal() throws LifecycleException {
        setState(LifecycleState.STOPPING);
    }

    @Override
    public int getRejectedSessions() {
        return 0;
    }

    public void setRejectedSessions1(int i) {
    }

    @Override
    public void load() throws ClassNotFoundException, IOException {
    }

    public void setRejectedSessions(int arg0) {

    }

    @Override
    public void unload() throws IOException {
    }

    @Override
    public Session createSession(String sessionId) {
        // do nothing
        return null;
    }

    public Session createSession() {
        // do nothing
        return null;
    }

    @Override
    public Session createEmptySession() {
        // do nothing
        return null;
    }

    @Override
    public void add(Session session) {

    }

    @Override
    public Session findSession(String id) {
        return null;
    }

    @Override
    public void remove(Session session) {
        remove(session, false);
    }

    @Override
    public void remove(Session session, boolean update) {

    }

    @Override
    public void processExpires() {
    }
}