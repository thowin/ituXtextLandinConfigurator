/**
 * generated by Xtext 2.10.0
 */
package itu.xtext.landin.configurator.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class ExpressionsLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public ExpressionsLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
