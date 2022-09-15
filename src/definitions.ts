export interface AndroidInsetsPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
