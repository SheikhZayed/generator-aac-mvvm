package a.di.builder;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import a.di.modules.HomeFragmentModule;
import a.view.ui.home.HomeFragment;

/**
 * Created by Ashif on 3/8/17,August,2017
 * github.com/SheikhZayed
 */
@Module
public abstract class FragmentBuilder {
    /*
    all the fragments which are to be attached to
    dagger should be listed here
     */

    @ContributesAndroidInjector(modules = HomeFragmentModule.class)
    abstract HomeFragment providesHomeFragment();
}
