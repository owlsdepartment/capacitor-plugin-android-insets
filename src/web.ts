import { WebPlugin } from '@capacitor/core';

import type { AndroidInsetsPlugin, TopReturn } from './definitions';

export class AndroidInsetsWeb extends WebPlugin implements AndroidInsetsPlugin {
  async top(): Promise<TopReturn> {
    return { value: 0 };
  }
}
