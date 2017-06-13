package sk.petko.flowerkeeper.core.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.petko.flowerkeeper.frontend.manager.FrontendManager;

public class ApplicationActivator {

    private static final Logger LOG = LoggerFactory.getLogger(ApplicationActivator.class);
    private FrontendManager frontendManager;

    private ApplicationActivator() throws Exception {
        this.frontendManager = new FrontendManager();
    }

    public static void main(String[] args) throws Exception {
        LOG.info("Initializing...");
        new ApplicationActivator();
    }
}
