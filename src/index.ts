import { registerPlugin } from '@capacitor/core';

import type { AndroidInsetsPlugin } from './definitions';

const AndroidInsets = registerPlugin<AndroidInsetsPlugin>('AndroidInsets', {
  web: () => import('./web').then(m => new m.AndroidInsetsWeb()),
});

export * from './definitions';
export { AndroidInsets };
