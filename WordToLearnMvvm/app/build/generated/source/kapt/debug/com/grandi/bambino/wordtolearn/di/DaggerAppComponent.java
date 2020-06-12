// Generated by Dagger (https://google.github.io/dagger).
package com.grandi.bambino.wordtolearn.di;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.ViewModel;
import com.grandi.bambino.wordtolearn.model.data.SearchResult;
import com.grandi.bambino.wordtolearn.model.source.IDataSource;
import com.grandi.bambino.wordtolearn.repository.IRepository;
import com.grandi.bambino.wordtolearn.ui.activity.MainActivity;
import com.grandi.bambino.wordtolearn.ui.activity.MainActivity_MembersInjector;
import com.grandi.bambino.wordtolearn.viewmodel.MainViewModel;
import com.grandi.bambino.wordtolearn.viewmodel.MainViewModel_Factory;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityModule_ContributeMainActivity.MainActivitySubcomponent.Builder>
      mainActivitySubcomponentBuilderProvider;

  private Provider<IDataSource<List<SearchResult>>> provideDataSourceRemote$app_debugProvider;

  private Provider<IDataSource<List<SearchResult>>> provideDataSourceLocal$app_debugProvider;

  private Provider<IRepository<List<SearchResult>>> provideRepositoryRemote$app_debugProvider;

  private InteractorModule_ProvideInteractor$app_debugFactory provideInteractor$app_debugProvider;

  private MainViewModel_Factory mainViewModelProvider;

  private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>>
      mapOfClassOfAndProviderOfViewModelProvider;

  private Provider<ViewModelFactory> viewModelFactoryProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return Collections
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            singletonMap(MainActivity.class, (Provider) mainActivitySubcomponentBuilderProvider);
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<? extends Activity>>>emptyMap());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.mainActivitySubcomponentBuilderProvider =
        new Provider<ActivityModule_ContributeMainActivity.MainActivitySubcomponent.Builder>() {
          @Override
          public ActivityModule_ContributeMainActivity.MainActivitySubcomponent.Builder get() {
            return new MainActivitySubcomponentBuilder();
          }
        };
    this.provideDataSourceRemote$app_debugProvider =
        DoubleCheck.provider(
            RepositoryModule_ProvideDataSourceRemote$app_debugFactory.create(
                builder.repositoryModule));
    this.provideDataSourceLocal$app_debugProvider =
        DoubleCheck.provider(
            RepositoryModule_ProvideDataSourceLocal$app_debugFactory.create(
                builder.repositoryModule));
    this.provideRepositoryRemote$app_debugProvider =
        DoubleCheck.provider(
            RepositoryModule_ProvideRepositoryRemote$app_debugFactory.create(
                builder.repositoryModule,
                provideDataSourceRemote$app_debugProvider,
                provideDataSourceLocal$app_debugProvider));
    this.provideInteractor$app_debugProvider =
        InteractorModule_ProvideInteractor$app_debugFactory.create(
            builder.interactorModule, provideRepositoryRemote$app_debugProvider);
    this.mainViewModelProvider = MainViewModel_Factory.create(provideInteractor$app_debugProvider);
    this.mapOfClassOfAndProviderOfViewModelProvider =
        MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(1)
            .put(MainViewModel.class, (Provider) mainViewModelProvider)
            .build();
    this.viewModelFactoryProvider =
        DoubleCheck.provider(
            ViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider));
  }

  @Override
  public void inject(TranslatorApp englishVocabularyApp) {
    injectTranslatorApp(englishVocabularyApp);
  }

  private TranslatorApp injectTranslatorApp(TranslatorApp instance) {
    TranslatorApp_MembersInjector.injectDispatchingAndroidInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private InteractorModule interactorModule;

    private RepositoryModule repositoryModule;

    private Application application;

    @Override
    public AppComponent build() {
      if (interactorModule == null) {
        this.interactorModule = new InteractorModule();
      }
      if (repositoryModule == null) {
        this.repositoryModule = new RepositoryModule();
      }
      if (application == null) {
        throw new IllegalStateException(Application.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class MainActivitySubcomponentBuilder
      extends ActivityModule_ContributeMainActivity.MainActivitySubcomponent.Builder {
    private MainActivity seedInstance;

    @Override
    public ActivityModule_ContributeMainActivity.MainActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl
      implements ActivityModule_ContributeMainActivity.MainActivitySubcomponent {
    private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder) {}

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectViewModelFactory(
          instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
      return instance;
    }
  }
}
